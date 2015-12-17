# ElasticSearch Committer (REST interface)

## Introduction

Elasticsearch implementation of Norconex Committer using the Elasticsearch REST interface.

This is an alternative implementation of [Norconex/committer-elasticsearch](https://github.com/Norconex/committer-elasticsearch) (http://www.norconex.com/collectors/committer-elasticsearch) which uses the [Elasticsearch Node client](https://www.elastic.co/guide/en/elasticsearch/client/java-api/current/node-client.html) instead.

The [benefits of the REST interface](https://github.com/searchbox-io/Jest#comparison-to-native-api) are i.a. native support of drop-in HTTP proxies and caches, as well as the option to use HTTPS encryptio and/or HTTP authentication.

This committer uses the [Jest library](https://github.com/searchbox-io/Jest) as the Elasticsearch client.

## Status

Though we are using this library in production, it is not currently tested by an automated test suite. Proceed with caution!

This project is not currently deployed to any central repository. You must build it manually. Nor does a hosted documentation exist (other than this README).

## Usage / Configuration

The configuration is analogous to
http://www.norconex.com/collectors/committer-elasticsearch/configuration
except that instead of the optional `<clusterName>`, you must provide a
required `<serverUrl>`.

This URL must point to an elasticsearch REST interface and may either
use the http or https schema and may optionally include HTTP
authentication information. E.g., the following configuration would
initiate an encrypted connection to an ES instance at `search.example.com`
authenticating as user `user` with password `password`:

```xml
<committer
  class="com.norconex.committer.elasticsearch_rest.ElasticsearchCommitter"
>
  <indexName>crawler_index</indexName>
  <serverUrl>https://user:password@search.example.com:9200</serverUrl>
  <typeName>crawler_type</typeName>
</committer>
```
