<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , new RuntimeBeanReference ( STRING ) ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class , org.springframework.context.support.MutablePropertyValues ) ; org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , PropertyPlaceholderConfigurer .class , org.springframework.context.support.MutablePropertyValues ) ; try { org.springframework.context.support.StaticApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanInitializationException org.springframework.context.support.BeanInitializationException ) { assertTrue ( org.springframework.context.support.BeanInitializationException . getCause ( ) instanceof java.io.FileNotFoundException ) ; java.lang.String java.lang.String = StringUtils . cleanPath ( java.lang.System . java.lang.String ( STRING ) ) ; if ( java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER ) ; } assertTrue ( org.springframework.context.support.BeanInitializationException . getMessage ( ) . indexOf ( java.lang.String ) != - NUMBER ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , new RuntimeBeanReference ( STRING ) ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class , org.springframework.context.support.MutablePropertyValues ) ; org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , PropertyPlaceholderConfigurer .class , org.springframework.context.support.MutablePropertyValues ) ; try { org.springframework.context.support.StaticApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanInitializationException org.springframework.context.support.BeanInitializationException ) { assertTrue ( org.springframework.context.support.BeanInitializationException . getCause ( ) instanceof java.io.FileNotFoundException ) ; java.lang.String java.lang.String = StringUtils . cleanPath ( java.lang.System . java.lang.String ( STRING ) ) ; if ( java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER ) ; } assertTrue ( org.springframework.context.support.BeanInitializationException . getMessage ( ) . contains ( java.lang.String + STRING + java.lang.String ) || org.springframework.context.support.BeanInitializationException . getMessage ( ) . contains ( java.lang.String + STRING + java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , new RuntimeBeanReference ( STRING ) ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class , org.springframework.context.support.MutablePropertyValues ) ; org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , PropertyPlaceholderConfigurer .class , org.springframework.context.support.MutablePropertyValues ) ; try { org.springframework.context.support.StaticApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanInitializationException org.springframework.context.support.BeanInitializationException ) { assertTrue ( org.springframework.context.support.BeanInitializationException . getMessage ( ) . contains ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class , org.springframework.context.support.MutablePropertyValues ) ; org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , PropertyPlaceholderConfigurer .class , org.springframework.context.support.MutablePropertyValues ) ; try { org.springframework.context.support.StaticApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanDefinitionStoreException org.springframework.context.support.BeanDefinitionStoreException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class , org.springframework.context.support.MutablePropertyValues ) ; org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , PropertyPlaceholderConfigurer .class , org.springframework.context.support.MutablePropertyValues ) ; try { org.springframework.context.support.StaticApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanDefinitionStoreException org.springframework.context.support.BeanDefinitionStoreException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class , org.springframework.context.support.MutablePropertyValues ) ; org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , PropertyPlaceholderConfigurer .class , org.springframework.context.support.MutablePropertyValues ) ; try { org.springframework.context.support.StaticApplicationContext . refresh ( ) ; fail ( STRING ) ; } catch ( BeanDefinitionStoreException org.springframework.context.support.BeanDefinitionStoreException ) { org.springframework.context.support.BeanDefinitionStoreException . printStackTrace ( ) ; } }  <METHOD_END>
<METHOD_START> @ Ignore @ Test public void void ( ) { }  <METHOD_END>