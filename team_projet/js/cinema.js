
document.addEventListener("DOMContentLoaded", () => {
  const navItems = document.querySelectorAll(".nav-menu > ul > li");

  navItems.forEach((item) => {
    const subMenu = item.querySelector(".sub-menu");
    if (!subMenu) return;

    subMenu.style.display = "none"; // 

    item.addEventListener("mouseenter", () => {
      subMenu.style.display = "block";
    });

    item.addEventListener("mouseleave", () => {
      subMenu.style.display = "none";
    });
  });
});