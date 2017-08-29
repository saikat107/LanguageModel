<METHOD_START> @ Before public void void ( ) { org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.ConfigurablePropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; java.util.Properties = new java.util.Properties ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new PropertiesPropertySource ( STRING , java.util.Properties ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . containsProperty ( STRING ) , is ( false ) ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . containsProperty ( STRING ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , nullValue ( ) ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING , STRING ) , is ( STRING ) ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( STRING ) . withProperty ( STRING , STRING ) ) ; assertThat ( org.springframework.core.env.PropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( STRING ) . withProperty ( STRING , STRING ) ) ; assertThat ( org.springframework.core.env.PropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( STRING ) . withProperty ( STRING , STRING ) ) ; assertThat ( org.springframework.core.env.PropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; org.springframework.core.env.MutablePropertySources . addLast ( new MapPropertySource ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , null ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING , java.lang.Integer .class , NUMBER ) , equalTo ( NUMBER ) ) ; java.util.Properties . java.lang.Object ( STRING , NUMBER ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING , java.lang.Integer .class , NUMBER ) , equalTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties . java.lang.Object ( STRING , STRING ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING , java.lang.String [] .class ) , equalTo ( new java.lang.String [] { STRING , STRING } ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties . java.lang.Object ( STRING , STRING ) ; class TestType { } try { org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING , TestType .class ) ; fail ( STRING ) ; } catch ( ConverterNotFoundException org.springframework.core.env.ConverterNotFoundException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.HashMap<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.String ) ; MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MapPropertySource ( STRING , java.util.HashMap<java.lang.String,java.lang.Object> ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.PropertyResolver . getProperty ( java.lang.String ) , equalTo ( java.lang.String ) ) ; java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.String ) ; assertThat ( org.springframework.core.env.PropertyResolver . getProperty ( java.lang.String ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.HashMap<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MapPropertySource ( STRING , java.util.HashMap<java.lang.String,java.lang.Object> ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.PropertyResolver . getProperty ( STRING ) , equalTo ( null ) ) ; java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; assertThat ( org.springframework.core.env.PropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.ConfigurablePropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; org.springframework.core.env.MutablePropertySources . addLast ( new MockPropertySource ( STRING ) . withProperty ( STRING , STRING ) ) ; org.springframework.core.env.MutablePropertySources . addLast ( new MockPropertySource ( STRING ) . withProperty ( STRING , STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; org.springframework.core.env.MutablePropertySources . replace ( STRING , new MockPropertySource ( STRING ) . withProperty ( STRING , STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.core.env.MutablePropertySources . size ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties . java.lang.Object ( STRING , STRING ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getRequiredProperty ( STRING ) , is ( STRING ) ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . getRequiredProperty ( STRING ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties . java.lang.Object ( STRING , STRING ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getRequiredProperty ( STRING , java.lang.String [] .class ) , equalTo ( new java.lang.String [] { STRING , STRING } ) ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . getRequiredProperty ( STRING , java.lang.String [] .class ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.PropertyResolver . resolvePlaceholders ( STRING ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.PropertyResolver . resolvePlaceholders ( STRING ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.PropertyResolver . resolvePlaceholders ( STRING ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new PropertySourcesPropertyResolver ( new MutablePropertySources ( ) ) . resolvePlaceholders ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.PropertyResolver . resolveRequiredPlaceholders ( STRING ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; org.springframework.core.env.PropertyResolver . resolveRequiredPlaceholders ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) ) ; PropertyResolver org.springframework.core.env.PropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.PropertyResolver . resolveRequiredPlaceholders ( STRING ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new PropertySourcesPropertyResolver ( new MutablePropertySources ( ) ) . resolveRequiredPlaceholders ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.core.env.ConfigurablePropertyResolver . validateRequiredProperties ( ) ; org.springframework.core.env.ConfigurablePropertyResolver . setRequiredProperties ( STRING , STRING ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . validateRequiredProperties ( ) ; fail ( STRING ) ; } catch ( MissingRequiredPropertiesException org.springframework.core.env.MissingRequiredPropertiesException ) { assertThat ( org.springframework.core.env.MissingRequiredPropertiesException . getMessage ( ) , equalTo ( STRING + STRING ) ) ; } java.util.Properties . java.lang.Object ( STRING , STRING ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . validateRequiredProperties ( ) ; fail ( STRING ) ; } catch ( MissingRequiredPropertiesException org.springframework.core.env.MissingRequiredPropertiesException ) { assertThat ( org.springframework.core.env.MissingRequiredPropertiesException . getMessage ( ) , equalTo ( STRING + STRING ) ) ; } java.util.Properties . java.lang.Object ( STRING , STRING ) ; org.springframework.core.env.ConfigurablePropertyResolver . validateRequiredProperties ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) ) ; ConfigurablePropertyResolver org.springframework.core.env.ConfigurablePropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertThat ( java.lang.IllegalArgumentException . java.lang.String ( ) , containsString ( STRING ) ) ; } assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertTrue ( java.lang.IllegalArgumentException . java.lang.String ( ) . java.lang.String ( ) . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MutablePropertySources org.springframework.core.env.MutablePropertySources = new MutablePropertySources ( ) ; org.springframework.core.env.MutablePropertySources . addFirst ( new MockPropertySource ( ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) . withProperty ( STRING , STRING ) ) ; ConfigurablePropertyResolver org.springframework.core.env.ConfigurablePropertyResolver = new PropertySourcesPropertyResolver ( org.springframework.core.env.MutablePropertySources ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertThat ( java.lang.IllegalArgumentException . java.lang.String ( ) , containsString ( STRING ) ) ; } org.springframework.core.env.ConfigurablePropertyResolver . setIgnoreUnresolvableNestedPlaceholders ( true ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . getProperty ( STRING ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.core.env.ConfigurablePropertyResolver . resolvePlaceholders ( STRING ) , equalTo ( STRING ) ) ; try { org.springframework.core.env.ConfigurablePropertyResolver . resolveRequiredPlaceholders ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertThat ( java.lang.IllegalArgumentException . java.lang.String ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
