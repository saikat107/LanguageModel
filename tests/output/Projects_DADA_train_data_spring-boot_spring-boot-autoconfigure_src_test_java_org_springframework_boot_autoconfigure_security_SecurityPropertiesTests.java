<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . setIgnoreUnknownFields ( false ) ; this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . setConversionService ( new DefaultConversionService ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getIgnored ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getIgnored ( ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getIgnored ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getIgnored ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Map<java.lang.String,java.lang.String> ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getIgnored ( ) ) . hasSize ( NUMBER ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getIgnored ( ) . contains ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getUser ( ) . isDefaultPassword ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getUser ( ) . isDefaultPassword ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getUser ( ) . getRole ( ) . toString ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.SecurityProperties . getUser ( ) . getRole ( ) . toString ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
