ElasticSearch Committer (REST interface)
========================================

Elasticsearch implementation of Norconex Committer using the
Elasticsearch REST interface.

This is an alternative implementation of
https://github.com/Norconex/committer-elasticsearch
(http://www.norconex.com/collectors/committer-elasticsearch) which uses
the Elasticsearch Node client instead.

The benefits of the REST interface are native support drop-in HTTP
proxies and caches, HTTPS encryption, and HTTP authentication.

This committer is based on the [Jest library](https://github.com/searchbox-io/Jest).

The configuration is analogous to
http://www.norconex.com/collectors/committer-elasticsearch/configuration
except that instead of the optional `<clusterName>`, you must provide a
required `<serverUrl>`.

This URL must point to an elasticsearch REST interface and may either
use the http or https schema and may optionally include HTTP
authentication information. E.g., the following configuration would
initiate an encrypted connection to an ES instance at `search.example.com`
authentication as user `user` with password `password`:

```xml
<committer
  class="com.norconex.committer.elasticsearch_rest.ElasticsearchCommitter"
>
  <indexName>crawler_index</indexName>
  <serverUrl>https://user:password@search.example.com:9200</serverUrl>
  <typeName>crawler_type</typeName>
</committer>
```
