<METHOD_START> public static < K , V > java.util.Map<K,java.util.Collection<V>> < K , java.util.Collection<V> < V > > java.util.Map<K,java.util.Collection<V>> ( MultiValueMap < K , V > org.springframework.data.rest.core.util.MultiValueMap<K,V> ) { Assert . notNull ( org.springframework.data.rest.core.util.MultiValueMap<K,V> , STRING ) ; java.util.Map<K,java.util.Collection<V>> < K , java.util.Collection<V> < V > > java.util.Map<K,java.util.Collection<V>> = new java.util.LinkedHashMap<K,java.util.Collection<V>> < K , java.util.Collection<V> < V > > ( org.springframework.data.rest.core.util.MultiValueMap<K,V> . size ( ) ) ; for ( java.util.Map.Entry<K,java.util.List<V>> < K , java.util.List<V> < V > > java.util.Map.Entry<K,java.util.List<V>> : org.springframework.data.rest.core.util.MultiValueMap<K,V> . entrySet ( ) ) { java.util.Map<K,java.util.Collection<V>> . java.util.Collection<V> ( java.util.Map.Entry<K,java.util.List<V>> . K ( ) , java.util.Map.Entry<K,java.util.List<V>> . java.util.List<V> ( ) ) ; } return java.util.Map<K,java.util.Collection<V>> ; }  <METHOD_END>