<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected < S > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> ( TypeInformation < S > org.springframework.data.mapping.context.TypeInformation<S> ) { return new BasicPersistentEntity <> ( ( TypeInformation < java.lang.Object > ) org.springframework.data.mapping.context.TypeInformation<S> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.mapping.context.SamplePersistentProperty org.springframework.data.mapping.context.SamplePersistentProperty ( Property org.springframework.data.mapping.context.Property , BasicPersistentEntity < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> , SimpleTypeHolder org.springframework.data.mapping.context.SimpleTypeHolder ) { return new SamplePersistentProperty ( org.springframework.data.mapping.context.Property , org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> , org.springframework.data.mapping.context.SimpleTypeHolder ) ; }  <METHOD_END>