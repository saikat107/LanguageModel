<METHOD_START> @ RequestMapping ( value = STRING ) @ ResponseBody @ Transactional public java.lang.String java.lang.String ( @ PathVariable java.util.UUID java.util.UUID , HttpSession org.springframework.data.neo4j.web.controller.HttpSession ) { User org.springframework.data.neo4j.web.controller.User = org.springframework.data.neo4j.web.controller.UserService . getUserByUuid ( java.util.UUID ) ; if ( org.springframework.data.neo4j.web.controller.User == null ) { return STRING ; } java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( User org.springframework.data.neo4j.web.controller.User : org.springframework.data.neo4j.web.controller.UserService . getNetwork ( org.springframework.data.neo4j.web.controller.User ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( org.springframework.data.neo4j.web.controller.User . getName ( ) ) . append ( STRING ) ; } return java.lang.StringBuilder . java.lang.String ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = STRING ) @ ResponseBody @ Transactional public java.lang.String java.lang.String ( @ PathVariable java.util.UUID java.util.UUID , HttpSession org.springframework.data.neo4j.web.controller.HttpSession ) { User org.springframework.data.neo4j.web.controller.User = org.springframework.data.neo4j.web.controller.UserService . getUserByUuid ( java.util.UUID ) ; if ( org.springframework.data.neo4j.web.controller.User == null ) { return STRING ; } java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( User org.springframework.data.neo4j.web.controller.User : org.springframework.data.neo4j.web.controller.User . getFriends ( ) ) { java.util.List<java.lang.String> . boolean ( org.springframework.data.neo4j.web.controller.User . getName ( ) ) ; } java.util.Collections . void ( java.util.List<java.lang.String> ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) . java.lang.StringBuilder ( STRING ) ; } return java.lang.StringBuilder . java.lang.String ( ) . java.lang.String ( ) ; }  <METHOD_END>
