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
