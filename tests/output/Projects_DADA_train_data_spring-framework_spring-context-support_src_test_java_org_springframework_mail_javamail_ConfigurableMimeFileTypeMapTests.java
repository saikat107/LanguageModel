<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableMimeFileTypeMap org.springframework.mail.javamail.ConfigurableMimeFileTypeMap = new ConfigurableMimeFileTypeMap ( ) ; org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . afterPropertiesSet ( ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableMimeFileTypeMap org.springframework.mail.javamail.ConfigurableMimeFileTypeMap = new ConfigurableMimeFileTypeMap ( ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( new java.io.File ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableMimeFileTypeMap org.springframework.mail.javamail.ConfigurableMimeFileTypeMap = new ConfigurableMimeFileTypeMap ( ) ; org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . setMappings ( new java.lang.String [] { STRING , STRING } ) ; org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . afterPropertiesSet ( ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.mail.javamail.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.mail.javamail.ConfigurableMimeFileTypeMapTests> ( ) ) ; ConfigurableMimeFileTypeMap org.springframework.mail.javamail.ConfigurableMimeFileTypeMap = new ConfigurableMimeFileTypeMap ( ) ; org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . setMappingLocation ( org.springframework.mail.javamail.Resource ) ; org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . afterPropertiesSet ( ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.mail.javamail.ConfigurableMimeFileTypeMap . getContentType ( STRING ) ) ; }  <METHOD_END>