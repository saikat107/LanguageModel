<METHOD_START> @ Before public void void ( ) { org.springframework.data.mongodb.gridfs.GridFsOperations . delete ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( query ( where ( STRING ) . is ( org.springframework.data.mongodb.gridfs.ObjectId ) ) ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . size ( ) , is ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { Document org.springframework.data.mongodb.gridfs.Document = new Document ( STRING , STRING ) ; ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING , org.springframework.data.mongodb.gridfs.Document ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( query ( whereMetaData ( STRING ) . is ( STRING ) ) ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . size ( ) , is ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata = new org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata ( ) ; org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata . java.lang.String = STRING ; ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING , org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( query ( whereFilename ( ) . is ( STRING ) ) ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . size ( ) , is ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING ) ; GridFsResource [] org.springframework.data.mongodb.gridfs.GridFsResource[] = org.springframework.data.mongodb.gridfs.GridFsOperations . getResources ( STRING ) ; assertThat ( resources . length , is ( NUMBER ) ) ; assertThat ( ( ( BsonObjectId ) org.springframework.data.mongodb.gridfs.GridFsResource[] [ NUMBER ] . getId ( ) ) . getValue ( ) , is ( org.springframework.data.mongodb.gridfs.ObjectId ) ) ; assertThat ( org.springframework.data.mongodb.gridfs.GridFsResource[] [ NUMBER ] . contentLength ( ) , is ( org.springframework.data.mongodb.gridfs.Resource . contentLength ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING ) ; GridFsResource [] org.springframework.data.mongodb.gridfs.GridFsResource[] = org.springframework.data.mongodb.gridfs.GridFsOperations . getResources ( STRING ) ; assertThat ( resources . length , is ( NUMBER ) ) ; assertThat ( ( ( BsonObjectId ) org.springframework.data.mongodb.gridfs.GridFsResource[] [ NUMBER ] . getId ( ) ) . getValue ( ) , is ( org.springframework.data.mongodb.gridfs.ObjectId ) ) ; assertThat ( org.springframework.data.mongodb.gridfs.GridFsResource[] [ NUMBER ] . contentLength ( ) , is ( org.springframework.data.mongodb.gridfs.Resource . contentLength ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING , STRING ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( query ( whereContentType ( ) . is ( STRING ) ) ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . size ( ) , is ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING ) ; ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING ) ; ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING ) ; Query org.springframework.data.mongodb.gridfs.Query = new Query ( ) . with ( new Sort ( Direction . ASC , STRING ) ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( org.springframework.data.mongodb.gridfs.Query ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> , hasSize ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( null ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> , hasSize ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mongodb.gridfs.GridFsOperations . getResource ( STRING ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { Document org.springframework.data.mongodb.gridfs.Document = new Document ( STRING , STRING ) ; ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING , org.springframework.data.mongodb.gridfs.Document ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( query ( whereMetaData ( STRING ) . is ( STRING ) ) ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> , hasSize ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata = new org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata ( ) ; org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata . java.lang.String = STRING ; ObjectId org.springframework.data.mongodb.gridfs.ObjectId = org.springframework.data.mongodb.gridfs.GridFsOperations . store ( org.springframework.data.mongodb.gridfs.Resource . getInputStream ( ) , STRING , org.springframework.data.mongodb.gridfs.GridFsTemplateIntegrationTests.Metadata ) ; java.util.List<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > java.util.List<com.mongodb.client.gridfs.model.GridFSFile> = new java.util.ArrayList<com.mongodb.client.gridfs.model.GridFSFile> < com . com.mongodb . com.mongodb . com.mongodb . com.mongodb . com.mongodb > ( ) ; GridFSFindIterable org.springframework.data.mongodb.gridfs.GridFSFindIterable = org.springframework.data.mongodb.gridfs.GridFsOperations . find ( query ( whereMetaData ( STRING ) . is ( STRING ) ) ) ; org.springframework.data.mongodb.gridfs.GridFSFindIterable . into ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> ) ; assertThat ( java.util.List<com.mongodb.client.gridfs.model.GridFSFile> , hasSize ( NUMBER ) ) ; assertEquals ( ( ( BsonObjectId ) java.util.List<com.mongodb.client.gridfs.model.GridFSFile> . get ( NUMBER ) . getId ( ) ) . getValue ( ) , org.springframework.data.mongodb.gridfs.ObjectId ) ; }  <METHOD_END>
<METHOD_START> private static void void ( GridFSFile org.springframework.data.mongodb.gridfs.GridFSFile , GridFSFile org.springframework.data.mongodb.gridfs.GridFSFile ) { assertThat ( org.springframework.data.mongodb.gridfs.GridFSFile . getId ( ) , is ( org.springframework.data.mongodb.gridfs.GridFSFile . getId ( ) ) ) ; assertThat ( org.springframework.data.mongodb.gridfs.GridFSFile . getMD5 ( ) , is ( org.springframework.data.mongodb.gridfs.GridFSFile . getMD5 ( ) ) ) ; assertThat ( org.springframework.data.mongodb.gridfs.GridFSFile . getMetaData ( ) , is ( org.springframework.data.mongodb.gridfs.GridFSFile . getMetaData ( ) ) ) ; }  <METHOD_END>
