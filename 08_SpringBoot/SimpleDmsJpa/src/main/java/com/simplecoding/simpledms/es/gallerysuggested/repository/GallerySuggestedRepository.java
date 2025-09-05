package com.simplecoding.simpledms.es.gallerysuggested.repository;


import com.simplecoding.simpledms.es.gallerysuggested.entity.GallerySuggested;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GallerySuggestedRepository extends ElasticsearchRepository<GallerySuggested, String> {





}
