<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , new JSONObject ( java.lang.String ) ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , JSONObject org.springframework.boot.json.JSONObject ) { for ( java.lang.Object java.lang.Object : org.springframework.boot.json.JSONObject . keySet ( ) ) { java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; java.lang.Object java.lang.Object = org.springframework.boot.json.JSONObject . get ( java.lang.String ) ; if ( java.lang.Object instanceof JSONObject ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , ( JSONObject ) java.lang.Object ) ; java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> ; } if ( java.lang.Object instanceof JSONArray ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; void ( java.util.List<java.lang.Object> , ( JSONArray ) java.lang.Object ) ; java.lang.Object = java.util.List<java.lang.Object> ; } java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> , JSONArray org.springframework.boot.json.JSONArray ) { for ( int int = NUMBER ; int < org.springframework.boot.json.JSONArray . length ( ) ; int ++ ) { java.lang.Object java.lang.Object = org.springframework.boot.json.JSONArray . get ( int ) ; if ( java.lang.Object instanceof JSONObject ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; void ( java.util.Map<java.lang.String,java.lang.Object> , ( JSONObject ) java.lang.Object ) ; java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> ; } if ( java.lang.Object instanceof JSONArray ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; void ( java.util.List<java.lang.Object> , ( JSONArray ) java.lang.Object ) ; java.lang.Object = java.util.List<java.lang.Object> ; } java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( java.lang.String java.lang.String ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; void ( java.util.List<java.lang.Object> , new JSONArray ( java.lang.String ) ) ; return java.util.List<java.lang.Object> ; }  <METHOD_END>
