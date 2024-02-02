package utilities;

public class Constants {
	
	
	public static final String GET_STARTED_HOMEPAGE = "(//a[@href='contact.html'])[2]";
	
	public static final String NAME_TEXT_FIELD = "id=name";
	

	//1st scenario    
	
		public static final String GET_SEE_NAME_LABLE ="(//label[@for='name'])[1]";
		public static final String GET_SEE_EMAIL_LABLE ="(//label[@for='email'])[1]";
		public static final String GET_SEE_SUBJECT_LABLE ="(//label[@for='subject'])[1]";
		public static final String GET_SEE_CONTACT_LABLE ="//label[normalize-space()='Contact Number']";
		public static final String GET_SEE_MESSAGE_LABLE ="(//label[@for='message'])[1]";
		public static final String GET_SEE_MESSAGE_BUTTON_LABLE ="(//span[normalize-space()='Send Message'])[1]";
		
		//2nd scenario
		public static final String GET_SEE_NAME_FIELD ="//*[@id='name']";
		public static final String GET_SEE_EMAIL_FIELD ="(//input[@id='email'])[1]";
		public static final String GET_SEE_SUBJECT_FIELD ="(//input[@id='subject'])[1]";
		public static final String GET_SEE_CONTACT_FIELD =" (//input[@id='phone'])[1]";
		public static final String GET_SEE_MESSAGE_FIELD ="(//textarea[@id='message'])[1]";
		
		//3rd  scenario
		public static final String GET_SEE_PHONE_NUM ="(//h3[normalize-space()='Phone Number'])[1]";
		public static final String GET_SEE_LOCATION ="(//h3[normalize-space()='Location'])[1]";
		public static final String GET_SEE_EMAIL_ADDRESS ="(//h3[normalize-space()='Email Address'])[1]";
		
		
		//4th scenario
		public static final String GET_SEE_GMAPS ="(//section[@class='pb-0'])/div/iframe";
		
		//5th scenario
		
		public static final String GET_SEE_FACEBOOK_ICON ="(//a[@href='#!'])[5]";
		public static final String GET_SEE_TWITTER_ICON ="(//i[@class='fab fa-twitter'])[2]";
		public static final String GET_SEE_INSTA_ICON ="(//a[@href='#!'])[7]";
		public static final String GET_SEE_LINKEDIN_ICON ="(//a[@href='#!'])[8]";
		
		
	
  public static final String GET_ABOUT_US = "//*[@id='nav']/li[2]/a";
	
	public static final String GET_SCROLL_MARK = "/html/body/a";
	
	public static final String GET_HOME_PAGE = "/html/body/div[1]/section[1]/div[1]/div/div/ul/li[1]/a";
	
	public static final String CUSTOMER_EXPERIENCE_CONTENT_AU_PAGE = "/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/p";
	
	public static final String CUSTOMER_IMAGES ="/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/i";

	public static final String HOME_ABOUT_US = "/html/body/div[1]/section[1]/div[1]/div/div/ul/li[1]/a";
	
	public static final String IMAGE_BESIDE_CONTENT = "/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/i";
	
	public static final String WORKING_PROCESS_SECTION_XPATH = "/html/body/div[1]/section[4]/div/div[1]/h2";
	
	public static final String IMAGE_1_XPATH = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[1]/div/div/img";
	
	public static final String IMAGE_2_XPATH = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[2]/div/div/img";
	
	public static final String IMAGE_3_XPATH = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[3]/div/div/img";
	
	public static final String CONTENT_BELOW_IMAGE_1 ="/html/body/div[1]/section[4]/div/div[2]/div[2]/div[1]/div/p";
	
	public static final String CONTENT_BELOW_IMAGE_2 = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[2]/div/p";

    public static final String CONTENT_BELOW_IMAGE_3 = "/html/body/div[1]/section[4]/div/div[2]/div[2]/div[3]/div/p";
}
