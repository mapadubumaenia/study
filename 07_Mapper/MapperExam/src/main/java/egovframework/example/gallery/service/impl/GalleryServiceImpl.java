package egovframework.example.gallery.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import egovframework.example.common.Criteria;
import egovframework.example.gallery.service.GalleryService;
import egovframework.example.gallery.service.GalleryVO;

@Service
public class GalleryServiceImpl implements GalleryService{

	@Autowired
	GalleryMapper galleryMapper;
	
	
	
	@Override
	public List<?> selectGalleryList(Criteria criteria) {
		
		return galleryMapper.selectGalleryList(criteria); //전체조회
	}


     //총갯수 구하기
	@Override
	public int selectGalleryListTotCnt(Criteria criteria) {
		
		return galleryMapper.selectGalleryListTotCnt(criteria);
	}


	//업로드
		@Override
		public int insert(GalleryVO galleryVO) {
			//TODO 1)uuid 만들기(기본키): 자바에서 중복안되게 만들어 주는 글자(랜덤)
			String newUuid=UUID.randomUUID().toString();
			//     2)다운로드 url 만들기 (개발자 알아서 정해야함)
			String downloadURL=generateDownloadUrl(newUuid);
			
			//     3)FileDbVO 에 위의 uuid, url 저장(setter로 저장)
			galleryVO.setUuid(newUuid);
			galleryVO.setGalleryFileUrl(downloadURL);
			//     4)DB insert(FileDbVO)
			return galleryMapper.insert(galleryVO);
			 
		}

//		다운로드 URL을 만들어주는 메소드
		 public String generateDownloadUrl(String uuid) {
			 //  인터넷 주소 체계=> http://localhost:8080/경로(path)?쿼리스트링
			 //  기본주소(ContextPath): http://localhost:8080
			 //  URL 만드는 클래스:ServletUriComponentsBuilder
		        return ServletUriComponentsBuilder      
		          .fromCurrentContextPath()          //기본주소:http://localhost:8080
		          .path("/gallery/download.do")       //경로  :/gallery/download.do
		          .query("uuid="+uuid)               //쿼리스트링: ?uuid="+ uuid
		          .toUriString();                 // 위에꺼 조합 http://localhost:8080/gallery/download.do?uuid=uuid값
		   }

 
	//상세조회
	@Override
	public GalleryVO selectGallery(String uuid) {
		
		return galleryMapper.selectGallery(uuid);
	}

	
	
	
	
	
	
	
	
	
}
