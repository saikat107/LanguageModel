<METHOD_START> @ Test public void void ( ) { ClassPathXmlApplicationContext org.springframework.integration.sftp.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , org.springframework.integration.sftp.config.SftpMessageHistoryTests .class ) ; SourcePollingChannelAdapter org.springframework.integration.sftp.config.SourcePollingChannelAdapter = org.springframework.integration.sftp.config.ClassPathXmlApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; assertEquals ( STRING , org.springframework.integration.sftp.config.SourcePollingChannelAdapter . getComponentName ( ) ) ; assertEquals ( STRING , org.springframework.integration.sftp.config.SourcePollingChannelAdapter . getComponentType ( ) ) ; org.springframework.integration.sftp.config.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>
