<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] {} ) ; assertEquals ( java.lang.String .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] {} , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.lang.Integer .class , java.lang.Boolean .class } ) ; assertEquals ( java.lang.String .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { NUMBER , true } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.lang.Object .class } ) ; assertEquals ( java.lang.String .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { STRING } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.lang.String .class , java.lang.Object .class } ) ; assertEquals ( java.lang.Long .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { STRING , NUMBER } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.lang.String .class , java.lang.Object .class } ) ; assertEquals ( java.lang.String .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { STRING , STRING } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.lang.Class .class } ) ; assertEquals ( java.lang.Runnable .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { java.lang.Runnable .class } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; assertEquals ( java.lang.Runnable .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { java.lang.Runnable .class . java.lang.String ( ) } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.lang.String .class , java.lang.Class .class } ) ; assertEquals ( java.lang.Runnable .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { STRING , java.lang.Runnable .class } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.lang.Object .class , java.lang.Class .class } ) ; assertEquals ( java.lang.Runnable .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { STRING , java.lang.Runnable .class } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType .class } ) ; assertEquals ( java.lang.Object .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { new org.springframework.beans.factory.support.AutowireUtilsTests.MySimpleInterfaceType ( ) } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; java.util.Map<java.lang.Integer,java.lang.Boolean> < java.lang.Integer , java.lang.Boolean > java.util.Map<java.lang.Integer,java.lang.Boolean> = new java.util.HashMap<java.lang.Integer,java.lang.Boolean> <> ( ) ; java.util.Map<java.lang.Integer,java.lang.Boolean> . java.lang.Boolean ( NUMBER , false ) ; java.util.Map<java.lang.Integer,java.lang.Boolean> . java.lang.Boolean ( NUMBER , true ) ; java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.beans.factory.support.AutowireUtilsTests.MyTypeWithMethods .class , STRING , new java.lang.Class [] { java.util.Map .class } ) ; assertEquals ( java.lang.Object .class , AutowireUtils . resolveReturnTypeForFactoryMethod ( java.lang.reflect.Method , new java.lang.Object [] { java.util.Map<java.lang.Integer,java.lang.Boolean> } , java.lang.Class<? extends org.springframework.beans.factory.support.AutowireUtilsTests> ( ) . java.lang.ClassLoader ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<java.lang.Integer> < java.lang.Integer > org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<java.lang.Integer> ( ) { return null ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.support.AutowireUtilsTests.MySimpleInterfaceType org.springframework.beans.factory.support.AutowireUtilsTests.MySimpleInterfaceType ( ) { return null ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType ( ) { return null ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.Integer java.lang.Integer , java.lang.Boolean java.lang.Boolean ) { return null ; }  <METHOD_END>
<METHOD_START> public static < T > T T ( T T ) { return null ; }  <METHOD_END>
<METHOD_START> public static < T > T T ( java.lang.String java.lang.String , T T ) { return null ; }  <METHOD_END>
<METHOD_START> public static < MOCK > MOCK MOCK ( java.lang.Class<MOCK> < MOCK > java.lang.Class<MOCK> ) { return null ; }  <METHOD_END>
<METHOD_START> public static < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) { return null ; }  <METHOD_END>
<METHOD_START> public static < V extends java.lang.Object , T > T T ( V V , java.lang.Class<T> < T > java.lang.Class<T> ) { return null ; }  <METHOD_END>
<METHOD_START> public static < T > T T ( org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<T> < T > org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<T> ) { return null ; }  <METHOD_END>
<METHOD_START> public static < K , V > V V ( java.util.Map<K,V> < K , V > java.util.Map<K,V> ) { return null ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<java.lang.Integer> < java.lang.Integer > org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<java.lang.Integer> ) {		}  <METHOD_END>
<METHOD_START> public void void ( org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<java.lang.Integer> < java.lang.Integer > [] org.springframework.beans.factory.support.AutowireUtilsTests.MyInterfaceType<java.lang.Integer>[] ) {		}  <METHOD_END>
<METHOD_START> public void void ( T [] T[] ) {		}  <METHOD_END>
