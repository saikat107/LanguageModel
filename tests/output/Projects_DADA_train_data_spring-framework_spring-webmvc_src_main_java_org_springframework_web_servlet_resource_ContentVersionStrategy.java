<METHOD_START> public void ( ) { super( new FileNameVersionPathStrategy ( ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Resource org.springframework.web.servlet.resource.Resource ) { try { byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.servlet.resource.Resource . getInputStream ( ) ) ; return DigestUtils . md5DigestAsHex ( byte[] ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.web.servlet.resource.Resource , java.io.IOException ) ; } }  <METHOD_END>
