<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { StaticApplicationContext org.springframework.scripting.groovy.StaticApplicationContext = new StaticApplicationContext ( ) ; GroovyClassLoader org.springframework.scripting.groovy.GroovyClassLoader = new GroovyClassLoader ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.scripting.groovy.GroovyClassLoader . parseClass ( STRING ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.scripting.groovy.GroovyClassLoader . parseClass ( STRING ) ; org.springframework.scripting.groovy.StaticApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( java.lang.Class<> ) ) ; java.lang.Object java.lang.Object = org.springframework.scripting.groovy.StaticApplicationContext . getBean ( STRING ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING , new java.lang.Class<?> < ? > [ NUMBER ] ) ; java.lang.Object java.lang.Object = ReflectionUtils . invokeMethod ( java.lang.reflect.Method , java.lang.Object ) ; assertEquals ( STRING , java.lang.Object ) ; org.springframework.scripting.groovy.StaticApplicationContext . removeBeanDefinition ( STRING ) ; org.springframework.scripting.groovy.StaticApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( java.lang.Class<> ) ) ; java.lang.Object java.lang.Object = org.springframework.scripting.groovy.StaticApplicationContext . getBean ( STRING ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( STRING , new java.lang.Class<?> < ? > [ NUMBER ] ) ; java.lang.Object java.lang.Object = ReflectionUtils . invokeMethod ( java.lang.reflect.Method , java.lang.Object ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
