<METHOD_START> public void ( CriteriaAccessor < CRITERIA > org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> , SortAccessor < SORT > org.springframework.data.keyvalue.core.SortAccessor<SORT> ) { this . org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> = org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> ; this . org.springframework.data.keyvalue.core.SortAccessor<SORT> = org.springframework.data.keyvalue.core.SortAccessor<SORT> ; }  <METHOD_END>
<METHOD_START> public java.util.Collection<?> < ? > java.util.Collection<?> ( KeyValueQuery < ? > org.springframework.data.keyvalue.core.KeyValueQuery<?> , java.io.Serializable java.io.Serializable ) { CRITERIA CRITERIA = this . org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> != null ? this . org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> . resolve ( org.springframework.data.keyvalue.core.KeyValueQuery<> ) : null ; SORT SORT = this . org.springframework.data.keyvalue.core.SortAccessor<SORT> != null ? this . org.springframework.data.keyvalue.core.SortAccessor<SORT> . resolve ( org.springframework.data.keyvalue.core.KeyValueQuery<> ) : null ; return java.util.Collection<?> ( CRITERIA , SORT , org.springframework.data.keyvalue.core.KeyValueQuery<> . getOffset ( ) , org.springframework.data.keyvalue.core.KeyValueQuery<> . getRows ( ) , java.io.Serializable ) ; }  <METHOD_END>
<METHOD_START> public < T > java.util.Collection<T> < T > java.util.Collection<T> ( KeyValueQuery < ? > org.springframework.data.keyvalue.core.KeyValueQuery<?> , java.io.Serializable java.io.Serializable , java.lang.Class<T> < T > java.lang.Class<T> ) { CRITERIA CRITERIA = this . org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> != null ? this . org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> . resolve ( org.springframework.data.keyvalue.core.KeyValueQuery<> ) : null ; SORT SORT = this . org.springframework.data.keyvalue.core.SortAccessor<SORT> != null ? this . org.springframework.data.keyvalue.core.SortAccessor<SORT> . resolve ( org.springframework.data.keyvalue.core.KeyValueQuery<> ) : null ; return java.util.Collection ( CRITERIA , SORT , org.springframework.data.keyvalue.core.KeyValueQuery<> . getOffset ( ) , org.springframework.data.keyvalue.core.KeyValueQuery<> . getRows ( ) , java.io.Serializable , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public long long ( KeyValueQuery < ? > org.springframework.data.keyvalue.core.KeyValueQuery<?> , java.io.Serializable java.io.Serializable ) { CRITERIA CRITERIA = this . org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> != null ? this . org.springframework.data.keyvalue.core.CriteriaAccessor<CRITERIA> . resolve ( org.springframework.data.keyvalue.core.KeyValueQuery<> ) : null ; return long ( CRITERIA , java.io.Serializable ) ; }  <METHOD_END>
<METHOD_START> public abstract java.util.Collection<?> < ? > java.util.Collection<?> ( CRITERIA CRITERIA , SORT SORT , long long , int int , java.io.Serializable java.io.Serializable );  <METHOD_END>
<METHOD_START> public < T > java.util.Collection<T> < T > java.util.Collection<T> ( CRITERIA CRITERIA , SORT SORT , long long , int int , java.io.Serializable java.io.Serializable , java.lang.Class<T> < T > java.lang.Class<T> ) { return ( java.util.Collection<T> < T > ) java.util.Collection<?> ( CRITERIA , SORT , long , int , java.io.Serializable ) ; }  <METHOD_END>
<METHOD_START> public abstract long long ( CRITERIA CRITERIA , java.io.Serializable java.io.Serializable );  <METHOD_END>
<METHOD_START> protected ADAPTER ADAPTER ( ) { return this . ADAPTER ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( KeyValueAdapter org.springframework.data.keyvalue.core.KeyValueAdapter ) { if ( this . ADAPTER == null ) { this . ADAPTER = ( ADAPTER ) org.springframework.data.keyvalue.core.KeyValueAdapter ; } else { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
