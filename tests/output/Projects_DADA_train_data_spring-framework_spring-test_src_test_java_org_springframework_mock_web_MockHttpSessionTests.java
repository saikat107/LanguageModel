<METHOD_START> @ Test public void void ( ) { assertFalse ( org.springframework.mock.web.MockHttpSession . isInvalid ( ) ) ; org.springframework.mock.web.MockHttpSession . invalidate ( ) ; assertTrue ( org.springframework.mock.web.MockHttpSession . isInvalid ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . invalidate ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . getCreationTime ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . getLastAccessedTime ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . getAttribute ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . getAttributeNames ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . getValue ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . getValueNames ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . setAttribute ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . putValue ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . removeAttribute ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . removeValue ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { org.springframework.mock.web.MockHttpSession . invalidate ( ) ; org.springframework.mock.web.MockHttpSession . isNew ( ) ; }  <METHOD_END>
