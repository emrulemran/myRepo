package mail.practice;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static void sendEmail(String to) {
		
		// user credentials
		final String username = "username";
		final String password = "password";

		// set properties
		Properties props = new Properties();
		
		// set authentication
		props.put("mail.smtp.auth", "true");
		
		// start and set transport layer security
		props.put("mail.smtp.starttls.enable", "true");

		// set gmail server
		props.put("mail.smtp.host", "smtp.gmail.com");

		// set gmail server port
		props.put("mail.smtp.port", "587");

		// set authenticated session and credentials
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("fromemail"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			
			// set mail subject
			message.setSubject("A testing mail header !!!");
			
			// set message body
			message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please!");
			
			// transport and send message
			Transport.send(message);
			System.out.println("Message sent successfully!!!");
		}

		catch (MessagingException e) {
			// throw new RuntimeException(e);
			System.out.println("Username or Password are incorrect ... exiting !");
		}
	}

	public static void main(String[] args) {
		String to = "tomail";
		sendEmail(to);
	}
}