<METHOD_START> @ Test public void void ( ) { Environment org.springframework.core.env.Environment = new AbstractEnvironment ( ) { } ; assertThat ( org.springframework.core.env.Environment . acceptsProfiles ( AbstractEnvironment . RESERVED_DEFAULT_PROFILE_NAME ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { class CustomEnvironment extends AbstractEnvironment { @ java.lang.Override protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return java.util.Collections . java.util.Set<java.lang.String> ( ) ; } } Environment org.springframework.core.env.Environment = new CustomEnvironment ( ) ; assertThat ( org.springframework.core.env.Environment . acceptsProfiles ( AbstractEnvironment . RESERVED_DEFAULT_PROFILE_NAME ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return java.util.Collections . java.util.Set<java.lang.String> ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { class CustomEnvironment extends AbstractEnvironment { @ java.lang.Override protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return java.util.Collections . java.util.Set<java.lang.String> ( STRING ) ; } } Environment org.springframework.core.env.Environment = new CustomEnvironment ( ) ; assertThat ( org.springframework.core.env.Environment . acceptsProfiles ( AbstractEnvironment . RESERVED_DEFAULT_PROFILE_NAME ) , is ( false ) ) ; assertThat ( org.springframework.core.env.Environment . acceptsProfiles ( STRING ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return java.util.Collections . java.util.Set<java.lang.String> ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { class CustomEnvironment extends AbstractEnvironment { @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return new java.util.HashSet<java.lang.String> < java.lang.String > ( ) { { boolean ( STRING ) ; boolean ( STRING ) ; } } ; } } ConfigurableEnvironment org.springframework.core.env.ConfigurableEnvironment = new CustomEnvironment ( ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( AbstractEnvironment . RESERVED_DEFAULT_PROFILE_NAME ) , is ( false ) ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING , STRING ) , is ( true ) ) ; org.springframework.core.env.ConfigurableEnvironment . setDefaultProfiles ( STRING ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING , STRING ) , is ( false ) ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING ) , is ( true ) ) ; org.springframework.core.env.ConfigurableEnvironment . setActiveProfiles ( STRING , STRING ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING ) , is ( false ) ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING , STRING ) , is ( true ) ) ; org.springframework.core.env.ConfigurableEnvironment . setActiveProfiles ( ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING ) , is ( true ) ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING , STRING ) , is ( false ) ) ; org.springframework.core.env.ConfigurableEnvironment . setDefaultProfiles ( ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( AbstractEnvironment . RESERVED_DEFAULT_PROFILE_NAME ) , is ( false ) ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING , STRING ) , is ( false ) ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING ) , is ( false ) ) ; assertThat ( org.springframework.core.env.ConfigurableEnvironment . acceptsProfiles ( STRING , STRING ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return new java.util.HashSet<java.lang.String> < java.lang.String > ( ) { { boolean ( STRING ) ; boolean ( STRING ) ; } } ; }  <METHOD_END>