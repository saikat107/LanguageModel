<METHOD_START> @ Test public void void ( ) { CandidateComponentsIndex org.springframework.context.index.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( null ) ; assertThat ( STRING , org.springframework.context.index.CandidateComponentsIndex , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CandidateComponentsIndex org.springframework.context.index.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( CandidateComponentsTestClassLoader . index ( java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) . java.lang.ClassLoader ( ) , new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) ) ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = org.springframework.context.index.CandidateComponentsIndex . getCandidateTypes ( STRING , STRING ) ; assertThat ( java.util.Set<java.lang.String> , containsInAnyOrder ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CandidateComponentsIndex org.springframework.context.index.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( CandidateComponentsTestClassLoader . index ( java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) . java.lang.ClassLoader ( ) , new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) ) ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = org.springframework.context.index.CandidateComponentsIndex . getCandidateTypes ( STRING , STRING ) ; assertThat ( java.util.Set<java.lang.String> , containsInAnyOrder ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CandidateComponentsIndex org.springframework.context.index.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( CandidateComponentsTestClassLoader . index ( java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) . java.lang.ClassLoader ( ) , new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) ) ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = org.springframework.context.index.CandidateComponentsIndex . getCandidateTypes ( STRING , STRING ) ; assertThat ( java.util.Set<java.lang.String> , hasSize ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CandidateComponentsIndex org.springframework.context.index.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( CandidateComponentsTestClassLoader . index ( java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) . java.lang.ClassLoader ( ) , new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) ) ) ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = org.springframework.context.index.CandidateComponentsIndex . getCandidateTypes ( STRING , STRING ) ; assertThat ( java.util.Set<java.lang.String> , hasSize ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CandidateComponentsIndex org.springframework.context.index.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( CandidateComponentsTestClassLoader . disableIndex ( java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) . java.lang.ClassLoader ( ) ) ) ; assertThat ( org.springframework.context.index.CandidateComponentsIndex , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { CandidateComponentsIndex org.springframework.context.index.CandidateComponentsIndex = CandidateComponentsIndexLoader . loadIndex ( CandidateComponentsTestClassLoader . index ( java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) . java.lang.ClassLoader ( ) , new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) ) ) ) ; assertThat ( org.springframework.context.index.CandidateComponentsIndex , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { final java.io.IOException java.io.IOException = new java.io.IOException ( STRING ) ; this . org.springframework.context.index.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.context.index.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.context.index.ExpectedException . expectCause ( is ( java.io.IOException ) ) ; CandidateComponentsIndexLoader . loadIndex ( new CandidateComponentsTestClassLoader ( java.lang.Class<? extends org.springframework.context.index.CandidateComponentsIndexLoaderTests> ( ) . java.lang.ClassLoader ( ) , java.io.IOException ) ) ; }  <METHOD_END>
