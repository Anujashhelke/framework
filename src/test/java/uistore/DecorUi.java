package uistore;

import org.openqa.selenium.By;

public class DecorUi {
	public static By decor=By.xpath("//div[@class='navigation_wrapper']/descendant::li[@class='topnav_item decorunit']");
    public static By doormat=By.xpath("//ul[@class='taxonslist']/descendant::li[@class='subnav_item 14390']");
    public static By head=By.xpath("//div[@class='header-section']//h1");
   // public static By recommended=By.xpath("//div[@class='filter-section']//div[@class='item']");
    public static By recommended=By.xpath("//div[@class='sort-box']//div[@class='gname']");
    public static By New=By.xpath("//ul[@class='sortoptions']/descendant::li[contains(text(),'New Arrivals')]");
    public static By mat=By.xpath("//div[@class='clearfix']//ul[@class='productlist withdivider clearfix doormats productgrid']//li[6]");
    public static By dimensions=By.xpath("//div[@class='variant_dimensions v_159184']//div[@class='dimension-slideshow slick-initialized slick-slider']");
    public static By popup=By.xpath("//div[@class='vert-container'] //a[contains(text(),'Close')]");
}
