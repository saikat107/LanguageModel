<METHOD_START> public void ( JavaMailSenderImpl org.springframework.boot.autoconfigure.mail.JavaMailSenderImpl ) { this . org.springframework.boot.autoconfigure.mail.JavaMailSenderImpl = org.springframework.boot.autoconfigure.mail.JavaMailSenderImpl ; }  <METHOD_END>
<METHOD_START> @ javax.annotation.PostConstruct public void void ( ) { try { this . org.springframework.boot.autoconfigure.mail.JavaMailSenderImpl . testConnection ( ) ; } catch ( MessagingException org.springframework.boot.autoconfigure.mail.MessagingException ) { throw new java.lang.IllegalStateException ( STRING , org.springframework.boot.autoconfigure.mail.MessagingException ) ; } }  <METHOD_END>