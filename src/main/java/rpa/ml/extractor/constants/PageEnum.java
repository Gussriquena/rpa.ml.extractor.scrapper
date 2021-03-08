package rpa.ml.extractor.constants;

import rpa.ml.extractor.utils.ConfigReader;

public enum PageEnum {
	
	// URLs from properties
	URL_ML_MAIN(ConfigReader.read("ml.url.page.main")),
	URL_ML_SEARCH(ConfigReader.read("ml.url.page.search")),
	
	// Elements
	XPATH_PRODUCT_LIST_ITEM(ConfigReader.read("//li[@class='ui-search-layout__item']")),
	XPATH_PRODUCT_LIST_LINK(ConfigReader.read("//li[@class='ui-search-layout__item']//a[1][@class='ui-search-link']")),
	XPATH_PRODUCT_PAGE_PRICE(ConfigReader.read("(//div[@class='ui-pdp-price__second-line']/span/span[@class='price-tag-fraction'])[1]")),
	XPATH_PRODUCT_PAGE_AMOUNT(ConfigReader.read("//div[@class='ui-pdp-header']/div/span[@class='ui-pdp-subtitle']"));
	
	private String value;
	
	private PageEnum(String description) {
		this.value = description;
	}
	
	private String getValue() {
		return value;
	}
	
}