<METHOD_START> @ Before public void void ( ) { doReturn ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { doReturn ( java.lang.Object .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { doReturn ( java.lang.String [] [] .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Optional<? extends org.springframework.data.convert.PreferredConstructor<org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Foo,P>> < ? extends PreferredConstructor < org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Foo , P > > java.util.Optional<? extends org.springframework.data.convert.PreferredConstructor<org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Foo,P>> = new PreferredConstructorDiscoverer < org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Foo , P > ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Foo .class ) . getConstructor ( ) ; doReturn ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Foo .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; doReturn ( java.util.Optional<> ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ) . isInstanceOf ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Foo .class ) ; assertThat ( java.util.Optional<> ) . hasValueSatisfying ( it -> verify ( provider , times ( NUMBER ) ) . getParameterValue ( it . getParameters ( ) . iterator ( ) . next ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MappingInstantiationException .class ) @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { doReturn ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; doReturn ( PersistentEntity .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BasicPersistentEntity < org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Outer.Inner , P > org.springframework.data.convert.BasicPersistentEntity<org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Outer.Inner,P> = new BasicPersistentEntity <> ( from ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Outer.Inner .class ) ) ; assertThat ( org.springframework.data.convert.BasicPersistentEntity<org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Outer.Inner,P> . getPersistenceConstructor ( ) ) . hasValueSatisfying ( constructor -> { Parameter < Object , P > parameter = constructor . getParameters ( ) . iterator ( ) . next ( ) ; Object outer = new Outer ( ) ; doReturn ( Optional . of ( outer ) ) . when ( provider ) . getParameterValue ( parameter ) ; Inner instance = this . instance . createInstance ( entity , provider ) ; assertThat ( instance ) . isNotNull ( ) ; ReflectionUtils . doWithFields ( Inner .class , field -> { if ( field . isSynthetic ( ) && field . getName ( ) . startsWith ( STRING ) ) { ReflectionUtils . makeAccessible ( field ) ; assertThat ( ReflectionUtils . getField ( field , instance ) ) . isEqualTo ( outer ) ; } } ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) java.lang.Exception { PersistentEntity < org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample , P > org.springframework.data.convert.PersistentEntity<org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample,P> = new BasicPersistentEntity <> ( from ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample .class ) ) ; doReturn ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) ) . when ( org.springframework.data.convert.ParameterValueProvider<P> ) . getParameterValue ( any ( Parameter .class ) ) ; java.lang.reflect.Constructor java.lang.reflect.Constructor = org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample .class . java.lang.reflect.Constructor<org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample> ( java.lang.Long .class , java.lang.String .class ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = java.util.Arrays . java.util.List<java.lang.Object> ( STRING , STRING ) ; try { this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; fail ( STRING ) ; } catch ( MappingInstantiationException org.springframework.data.convert.MappingInstantiationException ) { assertThat ( org.springframework.data.convert.MappingInstantiationException . getConstructor ( ) ) . hasValue ( java.lang.reflect.Constructor ) ; assertThat ( org.springframework.data.convert.MappingInstantiationException . getConstructorArguments ( ) ) . isEqualTo ( java.util.List<java.lang.Object> ) ; assertThat ( org.springframework.data.convert.MappingInstantiationException . getEntityType ( ) ) . hasValue ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample .class ) ; assertThat ( org.springframework.data.convert.MappingInstantiationException . getMessage ( ) ) . contains ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.Sample .class . java.lang.String ( ) ) ; assertThat ( org.springframework.data.convert.MappingInstantiationException . getMessage ( ) ) . contains ( java.lang.Long .class . java.lang.String ( ) ) ; assertThat ( org.springframework.data.convert.MappingInstantiationException . getMessage ( ) ) . contains ( java.lang.String .class . java.lang.String ( ) ) ; assertThat ( org.springframework.data.convert.MappingInstantiationException . getMessage ( ) ) . contains ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { doReturn ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtorDefault .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; doReturn ( new PreferredConstructorDiscoverer <> ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtorDefault .class ) . getConstructor ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; java.util.stream.IntStream . java.util.stream.IntStream ( NUMBER , NUMBER ) . void ( int -> assertThat ( this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ) . isInstanceOf ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtorDefault .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { doReturn ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtorNoArgs .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; doReturn ( new PreferredConstructorDiscoverer <> ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtorNoArgs .class ) . getConstructor ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; java.util.stream.IntStream . java.util.stream.IntStream ( NUMBER , NUMBER ) . void ( int -> { java.lang.Object java.lang.Object = this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtorNoArgs .class ) ; assertThat ( ( ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtorNoArgs ) java.lang.Object ) . boolean ) . isTrue ( ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { doReturn ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor1ParamString .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; doReturn ( new PreferredConstructorDiscoverer <> ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor1ParamString .class ) . getConstructor ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; doReturn ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) ) . when ( org.springframework.data.convert.ParameterValueProvider<P> ) . getParameterValue ( any ( ) ) ; java.util.stream.IntStream . java.util.stream.IntStream ( NUMBER , NUMBER ) . void ( int -> { java.lang.Object java.lang.Object = this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor1ParamString .class ) ; assertThat ( ( ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor1ParamString ) java.lang.Object ) . boolean ) . isTrue ( ) ; assertThat ( ( ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor1ParamString ) java.lang.Object ) . java.lang.String ) . isEqualTo ( STRING ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { doReturn ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor2ParamStringString .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; doReturn ( new PreferredConstructorDiscoverer <> ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor2ParamStringString .class ) . getConstructor ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; java.util.stream.IntStream . java.util.stream.IntStream ( NUMBER , NUMBER ) . void ( int -> { when ( org.springframework.data.convert.ParameterValueProvider<P> . getParameterValue ( any ( ) ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) , java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) ) ; java.lang.Object java.lang.Object = this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor2ParamStringString .class ) ; assertThat ( ( ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor2ParamStringString ) java.lang.Object ) . boolean ) . isTrue ( ) ; assertThat ( ( ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor2ParamStringString ) java.lang.Object ) . java.lang.String ) . isEqualTo ( STRING ) ; assertThat ( ( ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjCtor2ParamStringString ) java.lang.Object ) . java.lang.String ) . isEqualTo ( STRING ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { doReturn ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor1ParamInt .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; doReturn ( new PreferredConstructorDiscoverer <> ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor1ParamInt .class ) . getConstructor ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; java.util.stream.IntStream . java.util.stream.IntStream ( NUMBER , NUMBER ) . void ( int -> { doReturn ( java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) ) . when ( org.springframework.data.convert.ParameterValueProvider<P> ) . getParameterValue ( any ( ) ) ; java.lang.Object java.lang.Object = this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor1ParamInt .class ) ; assertThat ( ( ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor1ParamInt ) java.lang.Object ) . int ) . isEqualTo ( NUMBER ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { doReturn ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString .class ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getType ( ) ; doReturn ( new PreferredConstructorDiscoverer <> ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString .class ) . getConstructor ( ) ) . when ( org.springframework.data.convert.PersistentEntity<,P> ) . getPersistenceConstructor ( ) ; java.util.stream.IntStream . java.util.stream.IntStream ( NUMBER , NUMBER ) . void ( int -> { when ( org.springframework.data.convert.ParameterValueProvider<P> . getParameterValue ( any ( Parameter .class ) ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) , java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) , java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) , java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) , java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) , java.util.Optional . java.util.Optional<java.lang.Integer> ( NUMBER ) , java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) ) ; java.lang.Object java.lang.Object = this . org.springframework.data.convert.ClassGeneratingEntityInstantiator . createInstance ( org.springframework.data.convert.PersistentEntity<,P> , org.springframework.data.convert.ParameterValueProvider<P> ) ; assertThat ( java.lang.Object ) . isInstanceOf ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString .class ) ; org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString = ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString ) java.lang.Object ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString . java.lang.String ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString . int ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString . int ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString . int ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString . int ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString . int ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.convert.ClassGeneratingEntityInstantiatorUnitTests.ObjectCtor7ParamsString5IntsString . java.lang.String ) . isEqualTo ( STRING ) ; } ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) {		}  <METHOD_END>
<METHOD_START> public void ( java.lang.Long java.lang.Long , java.lang.String java.lang.String ) { this . java.lang.Long = java.lang.Long ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) { boolean = true ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . boolean = true ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , int int , int int , int int , int int , int int , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . int = int ; this . int = int ; this . int = int ; this . int = int ; this . int = int ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
