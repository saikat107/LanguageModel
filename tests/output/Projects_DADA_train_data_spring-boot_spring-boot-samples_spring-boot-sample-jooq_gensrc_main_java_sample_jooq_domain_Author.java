<METHOD_START> @ java.lang.Override public java.lang.Class<sample.jooq.domain.Record> < Record > java.lang.Class<sample.jooq.domain.Record> ( ) { return Record .class ; }  <METHOD_END>
<METHOD_START> public void ( ) { this( STRING , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.String , sample.jooq.domain.Author ); }  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String , Table < Record > sample.jooq.domain.Table<sample.jooq.domain.Record> ) { this( java.lang.String , sample.jooq.domain.Table<sample.jooq.domain.Record> , null ); }  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String , Table < Record > sample.jooq.domain.Table<sample.jooq.domain.Record> , sample.jooq.domain.Field<?> < ? > [] sample.jooq.domain.Field<?>[] ) { super( java.lang.String , null , sample.jooq.domain.Table<sample.jooq.domain.Record> , sample.jooq.domain.Field<?>[] , STRING ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public sample.jooq.domain.Schema sample.jooq.domain.Schema ( ) { return Public . PUBLIC ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public sample.jooq.domain.UniqueKey<sample.jooq.domain.Record> < Record > sample.jooq.domain.UniqueKey<sample.jooq.domain.Record> ( ) { return Keys . CONSTRAINT_7 ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<sample.jooq.domain.UniqueKey<sample.jooq.domain.Record>> < UniqueKey < Record > > java.util.List<sample.jooq.domain.UniqueKey<sample.jooq.domain.Record>> ( ) { return java.util.Arrays .< UniqueKey < Record > > java.util.List<sample.jooq.domain.UniqueKey<sample.jooq.domain.Record>> ( Keys . CONSTRAINT_7 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public sample.jooq.domain.Author sample.jooq.domain.Author ( java.lang.String java.lang.String ) { return new sample.jooq.domain.Author ( java.lang.String , this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public sample.jooq.domain.Author sample.jooq.domain.Author ( java.lang.String java.lang.String ) { return new sample.jooq.domain.Author ( java.lang.String , null ) ; }  <METHOD_END>
