<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.condition.ConditionalOnJavaTests.Java9Required .class ) ; void ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.condition.ConditionalOnJavaTests.Java7Required .class ) ; void ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.condition.ConditionalOnJavaTests.Java8Required .class ) ; void ( true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( Range . EQUAL_OR_NEWER , JavaVersion . NINE , JavaVersion . EIGHT , true ) ; void ( Range . EQUAL_OR_NEWER , JavaVersion . EIGHT , JavaVersion . EIGHT , true ) ; void ( Range . EQUAL_OR_NEWER , JavaVersion . EIGHT , JavaVersion . NINE , false ) ; void ( Range . OLDER_THAN , JavaVersion . NINE , JavaVersion . EIGHT , false ) ; void ( Range . OLDER_THAN , JavaVersion . EIGHT , JavaVersion . EIGHT , false ) ; void ( Range . OLDER_THAN , JavaVersion . EIGHT , JavaVersion . NINE , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome = this . org.springframework.boot.autoconfigure.condition.OnJavaCondition . getMatchOutcome ( Range . EQUAL_OR_NEWER , JavaVersion . NINE , JavaVersion . EIGHT ) ; assertThat ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . getMessage ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome = this . org.springframework.boot.autoconfigure.condition.OnJavaCondition . getMatchOutcome ( Range . OLDER_THAN , JavaVersion . NINE , JavaVersion . EIGHT ) ; assertThat ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . getMessage ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( java.lang.String ( java.util.function.Function .class , java.nio.file.Files .class , java.util.ServiceLoader .class ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) throws java.lang.Exception { java.net.URL [] java.net.URL[] = ( ( java.net.URLClassLoader ) java.lang.Class<? extends org.springframework.boot.autoconfigure.condition.ConditionalOnJavaTests> ( ) . java.lang.ClassLoader ( ) ) . java.net.URL[] ( ) ; java.net.URLClassLoader java.net.URLClassLoader = new org.springframework.boot.autoconfigure.condition.ConditionalOnJavaTests.ClassHidingClassLoader ( java.net.URL[] , java.lang.Class<?>[] ) ; java.lang.Class<?> < ? > java.lang.Class<?> = java.net.URLClassLoader . java.lang.Class<?> ( ConditionalOnJava . ConditionalOnJava .class . java.lang.String ( ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( java.lang.Class<> , STRING ) ; java.lang.Object java.lang.Object = ReflectionUtils . invokeMethod ( java.lang.reflect.Method , null ) ; java.net.URLClassLoader . void ( ) ; return java.lang.Object . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( Range org.springframework.boot.autoconfigure.condition.Range , JavaVersion org.springframework.boot.autoconfigure.condition.JavaVersion , JavaVersion org.springframework.boot.autoconfigure.condition.JavaVersion , boolean boolean ) { ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome = this . org.springframework.boot.autoconfigure.condition.OnJavaCondition . getMatchOutcome ( org.springframework.boot.autoconfigure.condition.Range , org.springframework.boot.autoconfigure.condition.JavaVersion , org.springframework.boot.autoconfigure.condition.JavaVersion ) ; assertThat ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . isMatch ( ) ) . as ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . getMessage ( ) ) . isEqualTo ( boolean ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( java.lang.Class<> ) ; this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean ) { assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . getBeansOfType ( java.lang.String .class ) ) . hasSize ( boolean ? NUMBER : NUMBER ) ; }  <METHOD_END>
<METHOD_START> private void ( java.net.URL [] java.net.URL[] , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { super( java.net.URL[] , null ); this . java.util.List<java.lang.Class<?>> = java.util.Arrays . java.util.List<java.lang.Class<?>> ( java.lang.Class<?>[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) throws java.lang.ClassNotFoundException { if ( boolean ( java.lang.String ) ) { throw new java.lang.ClassNotFoundException ( ) ; } return super. java.lang.Class<?> ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { for ( java.lang.Class<?> < ? > java.lang.Class<?> : this . java.util.List<java.lang.Class<?>> ) { if ( java.lang.Class<> . java.lang.String ( ) . boolean ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> @ Bean java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
