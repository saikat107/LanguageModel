<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.repository.MongoClient org.springframework.data.mongodb.repository.MongoClient ( ) { return new MongoClient ( ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { org.springframework.data.mongodb.repository.UserWithComplexIdRepository . deleteAll ( ) ; org.springframework.data.mongodb.repository.MyId = new MyId ( ) ; org.springframework.data.mongodb.repository.MyId . val1 = STRING ; org.springframework.data.mongodb.repository.MyId . val2 = STRING ; org.springframework.data.mongodb.repository.UserWithComplexId = new UserWithComplexId ( ) ; org.springframework.data.mongodb.repository.UserWithComplexId . firstname = STRING ; org.springframework.data.mongodb.repository.UserWithComplexId . id = org.springframework.data.mongodb.repository.MyId ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.UserWithComplexIdRepository . save ( org.springframework.data.mongodb.repository.UserWithComplexId ) ; assertThat ( org.springframework.data.mongodb.repository.UserWithComplexIdRepository . getUserByComplexId ( org.springframework.data.mongodb.repository.MyId ) , is ( org.springframework.data.mongodb.repository.UserWithComplexId ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.UserWithComplexIdRepository . save ( org.springframework.data.mongodb.repository.UserWithComplexId ) ; java.util.List<org.springframework.data.mongodb.repository.UserWithComplexId> < UserWithComplexId > java.util.List<org.springframework.data.mongodb.repository.UserWithComplexId> = org.springframework.data.mongodb.repository.UserWithComplexIdRepository . findByUserIds ( java.util.Collections . java.util.Set ( org.springframework.data.mongodb.repository.MyId ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.repository.UserWithComplexId> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.repository.UserWithComplexId> , contains ( org.springframework.data.mongodb.repository.UserWithComplexId ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.UserWithComplexIdRepository . save ( org.springframework.data.mongodb.repository.UserWithComplexId ) ; assertThat ( org.springframework.data.mongodb.repository.UserWithComplexIdRepository . findOne ( org.springframework.data.mongodb.repository.MyId ) , is ( java.util.Optional . java.util.Optional ( org.springframework.data.mongodb.repository.UserWithComplexId ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.UserWithComplexIdRepository . save ( org.springframework.data.mongodb.repository.UserWithComplexId ) ; java.lang.Iterable<org.springframework.data.mongodb.repository.UserWithComplexId> < UserWithComplexId > java.lang.Iterable<org.springframework.data.mongodb.repository.UserWithComplexId> = org.springframework.data.mongodb.repository.UserWithComplexIdRepository . findAll ( java.util.Collections . java.util.Set ( org.springframework.data.mongodb.repository.MyId ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.mongodb.repository.UserWithComplexId> , is ( Matchers .< UserWithComplexId > iterableWithSize ( NUMBER ) ) ) ; assertThat ( java.lang.Iterable<org.springframework.data.mongodb.repository.UserWithComplexId> , contains ( org.springframework.data.mongodb.repository.UserWithComplexId ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.UserWithComplexIdRepository . save ( org.springframework.data.mongodb.repository.UserWithComplexId ) ; assertThat ( org.springframework.data.mongodb.repository.UserWithComplexIdRepository . getUserUsingComposedAnnotationByComplexId ( org.springframework.data.mongodb.repository.MyId ) , is ( org.springframework.data.mongodb.repository.UserWithComplexId ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.UserWithComplexIdRepository . save ( org.springframework.data.mongodb.repository.UserWithComplexId ) ; assertThat ( org.springframework.data.mongodb.repository.UserWithComplexIdRepository . findUsersUsingComposedMetaAnnotationByUserIds ( java.util.Arrays . java.util.List ( org.springframework.data.mongodb.repository.MyId ) ) , hasSize ( NUMBER ) ) ; }  <METHOD_END>
