<METHOD_START> @ java.lang.Override protected void void ( RegionFactory < K , V > org.springframework.data.gemfire.RegionFactory<K,V> , java.lang.Boolean java.lang.Boolean , DataPolicy org.springframework.data.gemfire.DataPolicy ) { if ( org.springframework.data.gemfire.DataPolicy == null ) { org.springframework.data.gemfire.DataPolicy = ( isPersistent ( ) ? DataPolicy . PERSISTENT_REPLICATE : DataPolicy . REPLICATE ) ; } else if ( DataPolicy . EMPTY . equals ( org.springframework.data.gemfire.DataPolicy ) ) { org.springframework.data.gemfire.DataPolicy = DataPolicy . EMPTY ; } else { Assert . isTrue ( org.springframework.data.gemfire.DataPolicy . withReplication ( ) , java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.DataPolicy ) ) ; } assertDataPolicyAndPersistentAttributesAreCompatible ( org.springframework.data.gemfire.DataPolicy ) ; org.springframework.data.gemfire.RegionFactory<K,V> . setDataPolicy ( org.springframework.data.gemfire.DataPolicy ) ; setDataPolicy ( org.springframework.data.gemfire.DataPolicy ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( RegionFactory < K , V > org.springframework.data.gemfire.RegionFactory<K,V> , java.lang.Boolean java.lang.Boolean , java.lang.String java.lang.String ) { DataPolicy org.springframework.data.gemfire.DataPolicy = null ; if ( java.lang.String != null ) { org.springframework.data.gemfire.DataPolicy = new DataPolicyConverter ( ) . convert ( java.lang.String ) ; Assert . notNull ( org.springframework.data.gemfire.DataPolicy , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; } void ( org.springframework.data.gemfire.RegionFactory<K,V> , java.lang.Boolean , org.springframework.data.gemfire.DataPolicy ) ; }  <METHOD_END>
