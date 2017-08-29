<METHOD_START> public static java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> ( ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = java.lang.ThreadLocal<java.util.Map<java.lang.Object,java.lang.Object>> . java.util.Map<java.lang.Object,java.lang.Object> ( ) ; return ( java.util.Map<java.lang.Object,java.lang.Object> != null ? java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( java.util.Map<java.lang.Object,java.lang.Object> ) : java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.lang.Object java.lang.Object ) { java.lang.Object java.lang.Object = TransactionSynchronizationUtils . unwrapResourceIfNecessary ( java.lang.Object ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object ) ; return ( java.lang.Object != null ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { java.lang.Object java.lang.Object = TransactionSynchronizationUtils . unwrapResourceIfNecessary ( java.lang.Object ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object ) ; if ( java.lang.Object != null && org.springframework.transaction.support.Log . isTraceEnabled ( ) ) { org.springframework.transaction.support.Log . trace ( STRING + java.lang.Object + STRING + java.lang.Object + STRING + java.lang.Thread . java.lang.Thread ( ) . java.lang.String ( ) + STRING ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = java.lang.ThreadLocal<java.util.Map<java.lang.Object,java.lang.Object>> . java.util.Map<java.lang.Object,java.lang.Object> ( ) ; if ( java.util.Map<java.lang.Object,java.lang.Object> == null ) { return null ; } java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object ) ; if ( java.lang.Object instanceof ResourceHolder && ( ( ResourceHolder ) java.lang.Object ) . isVoid ( ) ) { java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object ) ; if ( java.util.Map<java.lang.Object,java.lang.Object> . boolean ( ) ) { java.lang.ThreadLocal<java.util.Map<java.lang.Object,java.lang.Object>> . void ( ) ; } java.lang.Object = null ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws java.lang.IllegalStateException { java.lang.Object java.lang.Object = TransactionSynchronizationUtils . unwrapResourceIfNecessary ( java.lang.Object ) ; Assert . notNull ( java.lang.Object , STRING ) ; java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = java.lang.ThreadLocal<java.util.Map<java.lang.Object,java.lang.Object>> . java.util.Map<java.lang.Object,java.lang.Object> ( ) ; if ( java.util.Map<java.lang.Object,java.lang.Object> == null ) { java.util.Map<java.lang.Object,java.lang.Object> = new java.util.HashMap<java.lang.Object,java.lang.Object> <> ( ) ; java.lang.ThreadLocal<java.util.Map<java.lang.Object,java.lang.Object>> . void ( java.util.Map<java.lang.Object,java.lang.Object> ) ; } java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object , java.lang.Object ) ; if ( java.lang.Object instanceof ResourceHolder && ( ( ResourceHolder ) java.lang.Object ) . isVoid ( ) ) { java.lang.Object = null ; } if ( java.lang.Object != null ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object + STRING + java.lang.Object + STRING + java.lang.Thread . java.lang.Thread ( ) . java.lang.String ( ) + STRING ) ; } if ( org.springframework.transaction.support.Log . isTraceEnabled ( ) ) { org.springframework.transaction.support.Log . trace ( STRING + java.lang.Object + STRING + java.lang.Object + STRING + java.lang.Thread . java.lang.Thread ( ) . java.lang.String ( ) + STRING ) ; } }  <METHOD_END>
<METHOD_START> public static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) throws java.lang.IllegalStateException { java.lang.Object java.lang.Object = TransactionSynchronizationUtils . unwrapResourceIfNecessary ( java.lang.Object ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object ) ; if ( java.lang.Object == null ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object + STRING + java.lang.Thread . java.lang.Thread ( ) . java.lang.String ( ) + STRING ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> public static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { java.lang.Object java.lang.Object = TransactionSynchronizationUtils . unwrapResourceIfNecessary ( java.lang.Object ) ; return java.lang.Object ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = java.lang.ThreadLocal<java.util.Map<java.lang.Object,java.lang.Object>> . java.util.Map<java.lang.Object,java.lang.Object> ( ) ; if ( java.util.Map<java.lang.Object,java.lang.Object> == null ) { return null ; } java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object ) ; if ( java.util.Map<java.lang.Object,java.lang.Object> . boolean ( ) ) { java.lang.ThreadLocal<java.util.Map<java.lang.Object,java.lang.Object>> . void ( ) ; } if ( java.lang.Object instanceof ResourceHolder && ( ( ResourceHolder ) java.lang.Object ) . isVoid ( ) ) { java.lang.Object = null ; } if ( java.lang.Object != null && org.springframework.transaction.support.Log . isTraceEnabled ( ) ) { org.springframework.transaction.support.Log . trace ( STRING + java.lang.Object + STRING + java.lang.Object + STRING + java.lang.Thread . java.lang.Thread ( ) . java.lang.String ( ) + STRING ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( ) { return ( java.lang.ThreadLocal<java.util.Set<org.springframework.transaction.support.TransactionSynchronization>> . get ( ) != null ) ; }  <METHOD_END>
<METHOD_START> public static void void ( ) java.lang.IllegalStateException { if ( boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } org.springframework.transaction.support.Log . trace ( STRING ) ; java.lang.ThreadLocal<java.util.Set<org.springframework.transaction.support.TransactionSynchronization>> . set ( new java.util.LinkedHashSet <> ( ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( TransactionSynchronization org.springframework.transaction.support.TransactionSynchronization )			throws java.lang.IllegalStateException { Assert . notNull ( org.springframework.transaction.support.TransactionSynchronization , STRING ) ; if ( ! boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.lang.ThreadLocal<java.util.Set<org.springframework.transaction.support.TransactionSynchronization>> . get ( ) . add ( org.springframework.transaction.support.TransactionSynchronization ) ; }  <METHOD_END>
<METHOD_START> public static java.util.List<org.springframework.transaction.support.TransactionSynchronization> < TransactionSynchronization > java.util.List<org.springframework.transaction.support.TransactionSynchronization> ( ) java.lang.IllegalStateException { java.util.Set<org.springframework.transaction.support.TransactionSynchronization> < TransactionSynchronization > java.util.Set<org.springframework.transaction.support.TransactionSynchronization> = java.lang.ThreadLocal<java.util.Set<org.springframework.transaction.support.TransactionSynchronization>> . get ( ) ; if ( java.util.Set<org.springframework.transaction.support.TransactionSynchronization> == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } if ( java.util.Set<org.springframework.transaction.support.TransactionSynchronization> . isEmpty ( ) ) { return java.util.Collections . java.util.List<org.springframework.transaction.support.TransactionSynchronization> ( ) ; } else { java.util.List<org.springframework.transaction.support.TransactionSynchronization> < TransactionSynchronization > java.util.List<org.springframework.transaction.support.TransactionSynchronization> = new java.util.ArrayList <> ( java.util.Set<org.springframework.transaction.support.TransactionSynchronization> ) ; AnnotationAwareOrderComparator . sort ( java.util.List<org.springframework.transaction.support.TransactionSynchronization> ) ; return java.util.Collections . java.util.List<org.springframework.transaction.support.TransactionSynchronization> ( java.util.List<org.springframework.transaction.support.TransactionSynchronization> ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( ) java.lang.IllegalStateException { if ( ! boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } org.springframework.transaction.support.Log . trace ( STRING ) ; java.lang.ThreadLocal<java.util.Set<org.springframework.transaction.support.TransactionSynchronization>> . remove ( ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String java.lang.String ) { java.lang.ThreadLocal<java.lang.String> . void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( ) { return java.lang.ThreadLocal<java.lang.String> . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static void void ( boolean boolean ) { java.lang.ThreadLocal<java.lang.Boolean> . void ( boolean ? java.lang.Boolean . java.lang.Boolean : null ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( ) { return ( java.lang.ThreadLocal<java.lang.Boolean> . java.lang.Boolean ( ) != null ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.Integer java.lang.Integer ) { java.lang.ThreadLocal<java.lang.Integer> . void ( java.lang.Integer ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.Integer java.lang.Integer ( ) { return java.lang.ThreadLocal<java.lang.Integer> . java.lang.Integer ( ) ; }  <METHOD_END>
<METHOD_START> public static void void ( boolean boolean ) { java.lang.ThreadLocal<java.lang.Boolean> . void ( boolean ? java.lang.Boolean . java.lang.Boolean : null ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( ) { return ( java.lang.ThreadLocal<java.lang.Boolean> . java.lang.Boolean ( ) != null ) ; }  <METHOD_END>
<METHOD_START> public static void void ( ) { java.lang.ThreadLocal<java.util.Set<org.springframework.transaction.support.TransactionSynchronization>> . remove ( ) ; java.lang.ThreadLocal<java.lang.String> . void ( ) ; java.lang.ThreadLocal<java.lang.Boolean> . void ( ) ; ; java.lang.ThreadLocal<java.lang.Integer> . void ( ) ; ; java.lang.ThreadLocal<java.lang.Boolean> . void ( ) ; }  <METHOD_END>