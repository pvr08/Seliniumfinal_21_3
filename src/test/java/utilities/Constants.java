package utilities;

public class Constants {
	
	
	public static final String GET_STARTED_HOMEPAGE = "(//a[@href='contact.html'])[2]";
	
	public static final String NAME_TEXT_FIELD = "id=name";
	
	//1st scenario    
	
		public static final String GET_SEE_NAME_LABLE ="(//label[@for='name'])[1]";
		public static final String GET_SEE_EMAIL_LABLE ="//label[@for='email']";
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
		public static final String GET_SEE_GMAPS ="(//div[@class='quform-submit-inner'])[1]";
		
		//5th scenario
		
		public static final String GET_SEE_FACEBOOK_ICON ="(//a[@href='#!'])[5]";
		public static final String GET_SEE_TWITTER_ICON ="(//i[@class='fab fa-twitter'])[2]";
		public static final String GET_SEE_INSTA_ICON ="(//a[@href='#!'])[7]";
		public static final String GET_SEE_LINKEDIN_ICON ="(//a[@href='#!'])[8]";
	
}
