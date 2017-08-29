<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.ExpectedException . expectMessage ( STRING ) ; new DefaultApplicationArguments ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationArguments org.springframework.boot.ApplicationArguments = new DefaultApplicationArguments ( java.lang.String[] ) ; assertThat ( org.springframework.boot.ApplicationArguments . getSourceArgs ( ) ) . isEqualTo ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationArguments org.springframework.boot.ApplicationArguments = new DefaultApplicationArguments ( java.lang.String[] ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; assertThat ( org.springframework.boot.ApplicationArguments . getOptionNames ( ) ) . isEqualTo ( java.util.Set<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationArguments org.springframework.boot.ApplicationArguments = new DefaultApplicationArguments ( java.lang.String[] ) ; assertThat ( org.springframework.boot.ApplicationArguments . containsOption ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.boot.ApplicationArguments . containsOption ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.boot.ApplicationArguments . containsOption ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationArguments org.springframework.boot.ApplicationArguments = new DefaultApplicationArguments ( java.lang.String[] ) ; assertThat ( org.springframework.boot.ApplicationArguments . getOptionValues ( STRING ) ) . isEqualTo ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; assertThat ( org.springframework.boot.ApplicationArguments . getOptionValues ( STRING ) ) . isEmpty ( ) ; assertThat ( org.springframework.boot.ApplicationArguments . getOptionValues ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationArguments org.springframework.boot.ApplicationArguments = new DefaultApplicationArguments ( java.lang.String[] ) ; assertThat ( org.springframework.boot.ApplicationArguments . getNonOptionArgs ( ) ) . containsExactly ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationArguments org.springframework.boot.ApplicationArguments = new DefaultApplicationArguments ( new java.lang.String [] { STRING } ) ; assertThat ( org.springframework.boot.ApplicationArguments . getNonOptionArgs ( ) ) . isEmpty ( ) ; }  <METHOD_END>