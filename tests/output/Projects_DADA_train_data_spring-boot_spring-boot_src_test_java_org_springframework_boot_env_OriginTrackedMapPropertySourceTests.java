<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.env.OriginTrackedMapPropertySource . getProperty ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; assertThat ( this . org.springframework.boot.env.OriginTrackedMapPropertySource . getProperty ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , new OriginTrackedValue ( STRING , this . org.springframework.boot.env.PropertyOrigin ) ) ; assertThat ( this . org.springframework.boot.env.OriginTrackedMapPropertySource . getProperty ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.env.OriginTrackedMapPropertySource . getPropertyOrigin ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; assertThat ( this . org.springframework.boot.env.OriginTrackedMapPropertySource . getPropertyOrigin ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , new OriginTrackedValue ( STRING , this . org.springframework.boot.env.PropertyOrigin ) ) ; assertThat ( this . org.springframework.boot.env.OriginTrackedMapPropertySource . getPropertyOrigin ( STRING ) ) . isEqualTo ( this . org.springframework.boot.env.PropertyOrigin ) ; }  <METHOD_END>
