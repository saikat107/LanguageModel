<METHOD_START> @ java.lang.Deprecated public void ( java.util.List<T> < T > java.util.List<T> , Document org.springframework.data.mongodb.core.mapreduce.Document ) { Assert . notNull ( java.util.List<T> , STRING ) ; Assert . notNull ( org.springframework.data.mongodb.core.mapreduce.Document , STRING ) ; this . java.util.List<T> = java.util.List<T> ; this . org.springframework.data.mongodb.core.mapreduce.Document = org.springframework.data.mongodb.core.mapreduce.Document ; this . org.springframework.data.mongodb.core.mapreduce.MapReduceTiming = org.springframework.data.mongodb.core.mapreduce.MapReduceTiming ( org.springframework.data.mongodb.core.mapreduce.Document ) ; this . org.springframework.data.mongodb.core.mapreduce.MapReduceCounts = org.springframework.data.mongodb.core.mapreduce.MapReduceCounts ( org.springframework.data.mongodb.core.mapreduce.Document ) ; this . java.lang.String = java.lang.String ( org.springframework.data.mongodb.core.mapreduce.Document ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.List<T> < T > java.util.List<T> , MapReduceOutput org.springframework.data.mongodb.core.mapreduce.MapReduceOutput ) { Assert . notNull ( java.util.List<T> , STRING ) ; Assert . notNull ( org.springframework.data.mongodb.core.mapreduce.MapReduceOutput , STRING ) ; this . java.util.List<T> = java.util.List<T> ; this . org.springframework.data.mongodb.core.mapreduce.Document = null ; this . org.springframework.data.mongodb.core.mapreduce.MapReduceTiming = org.springframework.data.mongodb.core.mapreduce.MapReduceTiming ( org.springframework.data.mongodb.core.mapreduce.MapReduceOutput ) ; this . org.springframework.data.mongodb.core.mapreduce.MapReduceCounts = org.springframework.data.mongodb.core.mapreduce.MapReduceCounts ( org.springframework.data.mongodb.core.mapreduce.MapReduceOutput ) ; this . java.lang.String = java.lang.String ( org.springframework.data.mongodb.core.mapreduce.MapReduceOutput ) ; }  <METHOD_END>
<METHOD_START> public java.util.Iterator<T> < T > java.util.Iterator<T> ( ) { return java.util.List<T> . java.util.Iterator<T> ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.mapreduce.MapReduceTiming org.springframework.data.mongodb.core.mapreduce.MapReduceTiming ( ) { return org.springframework.data.mongodb.core.mapreduce.MapReduceTiming ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.mapreduce.MapReduceCounts org.springframework.data.mongodb.core.mapreduce.MapReduceCounts ( ) { return org.springframework.data.mongodb.core.mapreduce.MapReduceCounts ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.mapreduce.Document org.springframework.data.mongodb.core.mapreduce.Document ( ) { return org.springframework.data.mongodb.core.mapreduce.Document ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.mapreduce.MapReduceTiming org.springframework.data.mongodb.core.mapreduce.MapReduceTiming ( Document org.springframework.data.mongodb.core.mapreduce.Document ) { Document org.springframework.data.mongodb.core.mapreduce.Document = ( Document ) org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) ; if ( org.springframework.data.mongodb.core.mapreduce.Document == null ) { return new MapReduceTiming ( - NUMBER , - NUMBER , - NUMBER ) ; } if ( org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) != null && org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) != null && org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) != null ) { return new MapReduceTiming ( java.lang.Long ( org.springframework.data.mongodb.core.mapreduce.Document , STRING ) , java.lang.Long ( org.springframework.data.mongodb.core.mapreduce.Document , STRING ) , java.lang.Long ( org.springframework.data.mongodb.core.mapreduce.Document , STRING ) ) ; } return new MapReduceTiming ( - NUMBER , - NUMBER , - NUMBER ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Long java.lang.Long ( Document org.springframework.data.mongodb.core.mapreduce.Document , java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = org.springframework.data.mongodb.core.mapreduce.Document . get ( java.lang.String ) ; return java.lang.Object instanceof java.lang.Long ? ( java.lang.Long ) java.lang.Object : ( java.lang.Integer ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.mapreduce.MapReduceCounts org.springframework.data.mongodb.core.mapreduce.MapReduceCounts ( Document org.springframework.data.mongodb.core.mapreduce.Document ) { Document org.springframework.data.mongodb.core.mapreduce.Document = ( Document ) org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) ; if ( org.springframework.data.mongodb.core.mapreduce.Document == null ) { return MapReduceCounts . NONE ; } if ( org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) != null && org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) != null && org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) != null ) { return new MapReduceCounts ( java.lang.Long ( org.springframework.data.mongodb.core.mapreduce.Document , STRING ) , java.lang.Long ( org.springframework.data.mongodb.core.mapreduce.Document , STRING ) , java.lang.Long ( org.springframework.data.mongodb.core.mapreduce.Document , STRING ) ) ; } return MapReduceCounts . NONE ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( Document org.springframework.data.mongodb.core.mapreduce.Document ) { java.lang.Object java.lang.Object = org.springframework.data.mongodb.core.mapreduce.Document . get ( STRING ) ; if ( java.lang.Object == null ) { return null ; } return java.lang.Object instanceof Document ? ( ( Document ) java.lang.Object ) . get ( STRING ) . toString ( ) : java.lang.Object . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.mapreduce.MapReduceCounts org.springframework.data.mongodb.core.mapreduce.MapReduceCounts ( final MapReduceOutput org.springframework.data.mongodb.core.mapreduce.MapReduceOutput ) { return new MapReduceCounts ( org.springframework.data.mongodb.core.mapreduce.MapReduceOutput . getInputCount ( ) , org.springframework.data.mongodb.core.mapreduce.MapReduceOutput . getEmitCount ( ) , org.springframework.data.mongodb.core.mapreduce.MapReduceOutput . getOutputCount ( ) ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( final MapReduceOutput org.springframework.data.mongodb.core.mapreduce.MapReduceOutput ) { return org.springframework.data.mongodb.core.mapreduce.MapReduceOutput . getCollectionName ( ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.mapreduce.MapReduceTiming org.springframework.data.mongodb.core.mapreduce.MapReduceTiming ( MapReduceOutput org.springframework.data.mongodb.core.mapreduce.MapReduceOutput ) { return new MapReduceTiming ( - NUMBER , - NUMBER , org.springframework.data.mongodb.core.mapreduce.MapReduceOutput . getDuration ( ) ) ; }  <METHOD_END>