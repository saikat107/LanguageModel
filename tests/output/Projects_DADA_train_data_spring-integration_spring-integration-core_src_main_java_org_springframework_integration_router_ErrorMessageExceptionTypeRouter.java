<METHOD_START> @ java.lang.Override @ ManagedAttribute public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { super. setChannelMappings ( java.util.Map<java.lang.String,java.lang.String> ) ; if ( this . boolean ) { void ( java.util.Map<java.lang.String,java.lang.String> . java.util.Set<java.lang.String> ( ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ) { java.util.Map<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map<java.lang.String,java.lang.Class<?>> = new java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > ( ) ; for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { java.util.Map<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( java.lang.String , java.lang.Class<?> ( java.lang.String ) ) ; } this . java.util.Map<java.lang.String,java.lang.Class<?>> = java.util.Map<java.lang.String,java.lang.Class<?>> ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) { try { return ClassUtils . forName ( java.lang.String , getApplicationContext ( ) . getClassLoader ( ) ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { throw new java.lang.IllegalStateException ( STRING , java.lang.ClassNotFoundException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { super. setChannelMapping ( java.lang.String , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map<java.lang.String,java.lang.Class<?>> = new java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > ( this . java.util.Map<java.lang.String,java.lang.Class<?>> ) ; java.util.Map<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( java.lang.String , java.lang.Class<?> ( java.lang.String ) ) ; this . java.util.Map<java.lang.String,java.lang.Class<?>> = java.util.Map<java.lang.String,java.lang.Class<?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public void void ( java.lang.String java.lang.String ) { super. removeChannelMapping ( java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map<java.lang.String,java.lang.Class<?>> = new java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > ( this . java.util.Map<java.lang.String,java.lang.Class<?>> ) ; java.util.Map<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( java.lang.String ) ; this . java.util.Map<java.lang.String,java.lang.Class<?>> = java.util.Map<java.lang.String,java.lang.Class<?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ ManagedOperation public void void ( java.util.Properties java.util.Properties ) { super. replaceChannelMappings ( java.util.Properties ) ; void ( this . channelMappings . keySet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Exception { super. onInit ( ) ; void ( this . channelMappings . keySet ( ) ) ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( Message < ? > org.springframework.integration.router.Message<?> ) { java.lang.String java.lang.String = null ; java.lang.Object java.lang.Object = org.springframework.integration.router.Message<> . getPayload ( ) ; if ( java.lang.Object instanceof java.lang.Throwable ) { java.lang.Throwable java.lang.Throwable = ( java.lang.Throwable ) java.lang.Object ; while ( java.lang.Throwable != null ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Class<?>> < java.lang.String , java.lang.Class<?> < ? > > java.util.Map.Entry<java.lang.String,java.lang.Class<?>> : this . java.util.Map<java.lang.String,java.lang.Class<?>> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Class<?>>> ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.String ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = java.util.Map.Entry<java.lang.String,java.lang.Class<?>> . java.lang.Class<?> ( ) ; if ( java.lang.Class<> . boolean ( java.lang.Throwable ) ) { java.lang.String = java.lang.String ; } } java.lang.Throwable = java.lang.Throwable . java.lang.Throwable ( ) ; } } return java.util.Collections .< java.lang.Object > java.util.List<java.lang.Object> ( java.lang.String ) ; }  <METHOD_END>
