<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { assertFalse ( new FlashMap ( ) . isExpired ( ) ) ; FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; org.springframework.web.servlet.FlashMap . startExpirationPeriod ( NUMBER ) ; java.lang.Thread . void ( NUMBER ) ; assertTrue ( org.springframework.web.servlet.FlashMap . isExpired ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; org.springframework.web.servlet.FlashMap . startExpirationPeriod ( NUMBER ) ; java.lang.Thread . void ( NUMBER ) ; assertFalse ( org.springframework.web.servlet.FlashMap . isExpired ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . compareTo ( org.springframework.web.servlet.FlashMap ) ) ; org.springframework.web.servlet.FlashMap . setTargetRequestPath ( STRING ) ; assertEquals ( - NUMBER , org.springframework.web.servlet.FlashMap . compareTo ( org.springframework.web.servlet.FlashMap ) ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . compareTo ( org.springframework.web.servlet.FlashMap ) ) ; org.springframework.web.servlet.FlashMap . setTargetRequestPath ( STRING ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . compareTo ( org.springframework.web.servlet.FlashMap ) ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParam ( STRING , STRING ) ; assertEquals ( - NUMBER , org.springframework.web.servlet.FlashMap . compareTo ( org.springframework.web.servlet.FlashMap ) ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . compareTo ( org.springframework.web.servlet.FlashMap ) ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParam ( STRING , STRING ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . compareTo ( org.springframework.web.servlet.FlashMap ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParam ( STRING , STRING ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParam ( STRING , STRING ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParam ( STRING , null ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . getTargetRequestParams ( ) . size ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.FlashMap . getTargetRequestParams ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , null ) ; FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParams ( org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . getTargetRequestParams ( ) . size ( ) ) ; assertEquals ( NUMBER , org.springframework.web.servlet.FlashMap . getTargetRequestParams ( ) . get ( STRING ) . size ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.FlashMap . getTargetRequestParams ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParam ( STRING , STRING ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParam ( null , STRING ) ; assertTrue ( org.springframework.web.servlet.FlashMap . getTargetRequestParams ( ) . isEmpty ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> . add ( null , STRING ) ; FlashMap org.springframework.web.servlet.FlashMap = new FlashMap ( ) ; org.springframework.web.servlet.FlashMap . addTargetRequestParams ( org.springframework.web.servlet.MultiValueMap<java.lang.String,java.lang.String> ) ; assertTrue ( org.springframework.web.servlet.FlashMap . getTargetRequestParams ( ) . isEmpty ( ) ) ; }  <METHOD_END>