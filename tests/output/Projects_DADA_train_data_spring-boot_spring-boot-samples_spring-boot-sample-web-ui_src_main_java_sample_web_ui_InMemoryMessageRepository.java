<METHOD_START> @ java.lang.Override public java.lang.Iterable<sample.web.ui.Message> < Message > java.lang.Iterable<sample.web.ui.Message> ( ) { return this . java.util.concurrent.ConcurrentMap<java.lang.Long,sample.web.ui.Message> . values ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public sample.web.ui.Message sample.web.ui.Message ( Message sample.web.ui.Message ) { java.lang.Long java.lang.Long = sample.web.ui.Message . getId ( ) ; if ( java.lang.Long == null ) { java.lang.Long = java.util.concurrent.atomic.AtomicLong . long ( ) ; sample.web.ui.Message . setId ( java.lang.Long ) ; } this . java.util.concurrent.ConcurrentMap<java.lang.Long,sample.web.ui.Message> . put ( java.lang.Long , sample.web.ui.Message ) ; return sample.web.ui.Message ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public sample.web.ui.Message sample.web.ui.Message ( java.lang.Long java.lang.Long ) { return this . java.util.concurrent.ConcurrentMap<java.lang.Long,sample.web.ui.Message> . get ( java.lang.Long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Long java.lang.Long ) { this . java.util.concurrent.ConcurrentMap<java.lang.Long,sample.web.ui.Message> . remove ( java.lang.Long ) ; }  <METHOD_END>