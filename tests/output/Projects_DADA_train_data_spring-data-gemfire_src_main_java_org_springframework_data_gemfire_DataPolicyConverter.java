<METHOD_START> private static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return ( java.lang.String == null ? null : java.lang.String . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.DataPolicyConverter.Policy org.springframework.data.gemfire.DataPolicyConverter.Policy ( java.lang.String java.lang.String ) { try { return org.springframework.data.gemfire.DataPolicyConverter.Policy ( java.lang.String ( java.lang.String ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { return null ; } }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.DataPolicy org.springframework.data.gemfire.DataPolicy ( ) { switch ( this ) { case org.springframework.data.gemfire.DataPolicyConverter.Policy : return DataPolicy . EMPTY ; case org.springframework.data.gemfire.DataPolicyConverter.Policy : return DataPolicy . NORMAL ; case org.springframework.data.gemfire.DataPolicyConverter.Policy : return DataPolicy . PRELOADED ; case org.springframework.data.gemfire.DataPolicyConverter.Policy : return DataPolicy . PARTITION ; case org.springframework.data.gemfire.DataPolicyConverter.Policy : return DataPolicy . PERSISTENT_PARTITION ; case org.springframework.data.gemfire.DataPolicyConverter.Policy : return DataPolicy . REPLICATE ; case org.springframework.data.gemfire.DataPolicyConverter.Policy : return DataPolicy . PERSISTENT_REPLICATE ; case org.springframework.data.gemfire.DataPolicyConverter.Policy : default: return DataPolicy . DEFAULT ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.gemfire.DataPolicy org.springframework.data.gemfire.DataPolicy ( java.lang.String java.lang.String ) { org.springframework.data.gemfire.DataPolicyConverter.Policy org.springframework.data.gemfire.DataPolicyConverter.Policy = org.springframework.data.gemfire.DataPolicyConverter.Policy . org.springframework.data.gemfire.DataPolicyConverter.Policy ( java.lang.String ) ; return ( org.springframework.data.gemfire.DataPolicyConverter.Policy == null ? null : org.springframework.data.gemfire.DataPolicyConverter.Policy . org.springframework.data.gemfire.DataPolicy ( ) ) ; }  <METHOD_END>