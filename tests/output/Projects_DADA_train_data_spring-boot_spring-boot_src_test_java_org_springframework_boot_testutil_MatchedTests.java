<METHOD_START> @ Test public void void ( ) { assertThat ( STRING ) . is ( Matched . by ( startsWith ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.testutil.ExpectedException . expect ( java.lang.AssertionError .class ) ; this . org.springframework.boot.testutil.ExpectedException . expectMessage ( STRING ) ; assertThat ( STRING ) . is ( Matched . by ( startsWith ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( STRING ) . is ( Matched . when ( startsWith ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.testutil.ExpectedException . expect ( java.lang.AssertionError .class ) ; this . org.springframework.boot.testutil.ExpectedException . expectMessage ( STRING ) ; assertThat ( STRING ) . is ( Matched . when ( startsWith ( STRING ) ) ) ; }  <METHOD_END>
