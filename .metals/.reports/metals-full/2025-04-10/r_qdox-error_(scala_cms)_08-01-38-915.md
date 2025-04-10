error id: file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/servlet/ContentServlet.java
file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/servlet/ContentServlet.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[1,1]

error in qdox parser
file content:
```java
offset: 1
uri: file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/servlet/ContentServlet.java
text:
```scala
p@@ackage com.scalatutorial.servlet

import com.scalatutorial.dao.ContentDao
import com.scalatutorial.model.Content

import javax.servlet._
import javax.servlet.annotation._
import javax.servlet.http._
import java.io.IOException

@WebServlet(Array("/content"))
class ContentServlet extends HttpServlet {

  private var contentDao: ContentDao = _

  override def init(): Unit = {
    contentDao = new ContentDao()
  }

  @throws[ServletException]
  @throws[IOException]
  override def doPost(request: HttpServletRequest, response: HttpServletResponse): Unit = {

    // Set encoding
    request.setCharacterEncoding("UTF-8")

    // Get form data
    val title = request.getParameter("title")
    val body = request.getParameter("body")
    val author = request.getParameter("author")

    // Create new Content object
    val content = new Content(title = title, body = body, author = author, createdAt = new java.util.Date())

    // Save content
    contentDao.saveContent(content)

    // Redirect back to index or show success
    response.sendRedirect("index.html")
  }
}


```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:48)
	scala.meta.internal.mtags.MtagsIndexer.index(MtagsIndexer.scala:21)
	scala.meta.internal.mtags.MtagsIndexer.index$(MtagsIndexer.scala:20)
	scala.meta.internal.mtags.JavaMtags.index(JavaMtags.scala:38)
	scala.meta.internal.mtags.Mtags.index(Mtags.scala:101)
	scala.meta.internal.mtags.Mtags.allSymbols(Mtags.scala:21)
	scala.meta.internal.mtags.SymbolIndexBucket.allSymbols(SymbolIndexBucket.scala:277)
	scala.meta.internal.mtags.SymbolIndexBucket.addMtagsSourceFile(SymbolIndexBucket.scala:288)
	scala.meta.internal.mtags.SymbolIndexBucket.$anonfun$query0$1(SymbolIndexBucket.scala:204)
	scala.meta.internal.mtags.SymbolIndexBucket.$anonfun$query0$1$adapted(SymbolIndexBucket.scala:204)
	scala.collection.immutable.Set$Set1.foreach(Set.scala:177)
	scala.meta.internal.mtags.SymbolIndexBucket.query0(SymbolIndexBucket.scala:204)
	scala.meta.internal.mtags.SymbolIndexBucket.query(SymbolIndexBucket.scala:177)
	scala.meta.internal.mtags.OnDemandSymbolIndex.$anonfun$findSymbolDefinition$1(OnDemandSymbolIndex.scala:142)
	scala.collection.immutable.List.flatMap(List.scala:294)
	scala.meta.internal.mtags.OnDemandSymbolIndex.findSymbolDefinition(OnDemandSymbolIndex.scala:142)
	scala.meta.internal.mtags.OnDemandSymbolIndex.definition(OnDemandSymbolIndex.scala:48)
	scala.meta.internal.metals.Docstrings.indexSymbol(Docstrings.scala:137)
	scala.meta.internal.metals.Docstrings.documentation(Docstrings.scala:48)
	scala.meta.internal.metals.MetalsSymbolSearch.documentation(MetalsSymbolSearch.scala:51)
	scala.meta.internal.pc.JavaHoverProvider.documentation(JavaHoverProvider.scala:205)
	scala.meta.internal.pc.JavaHoverProvider.$anonfun$hoverOffset$1(JavaHoverProvider.scala:72)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.pc.JavaHoverProvider.hoverOffset(JavaHoverProvider.scala:68)
	scala.meta.internal.pc.JavaHoverProvider.hover(JavaHoverProvider.scala:44)
	scala.meta.internal.pc.JavaPresentationCompiler.hover(JavaPresentationCompiler.scala:77)
	scala.meta.internal.metals.Compilers.$anonfun$hover$1(Compilers.scala:995)
	scala.meta.internal.metals.Compilers.$anonfun$withPCAndAdjustLsp$12(Compilers.scala:1464)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.Compilers.$anonfun$withPCAndAdjustLsp$10(Compilers.scala:1464)
	scala.Option.flatMap(Option.scala:283)
	scala.meta.internal.metals.Compilers.withPCAndAdjustLsp(Compilers.scala:1446)
	scala.meta.internal.metals.Compilers.hover(Compilers.scala:990)
	scala.meta.internal.metals.MetalsLspService.$anonfun$hover$1(MetalsLspService.scala:959)
	scala.meta.internal.metals.CancelTokens$.future(CancelTokens.scala:38)
	scala.meta.internal.metals.MetalsLspService.hover(MetalsLspService.scala:957)
	scala.meta.internal.metals.WorkspaceLspService.hover(WorkspaceLspService.scala:506)
	scala.meta.metals.lsp.DelegatingScalaService.hover(DelegatingScalaService.scala:78)
	java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	java.base/java.lang.reflect.Method.invoke(Method.java:568)
	org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.lambda$recursiveFindRpcMethods$0(GenericEndpoint.java:65)
	org.eclipse.lsp4j.jsonrpc.services.GenericEndpoint.request(GenericEndpoint.java:128)
	org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.handleRequest(RemoteEndpoint.java:271)
	org.eclipse.lsp4j.jsonrpc.RemoteEndpoint.consume(RemoteEndpoint.java:201)
	org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.handleMessage(StreamMessageProducer.java:185)
	org.eclipse.lsp4j.jsonrpc.json.StreamMessageProducer.listen(StreamMessageProducer.java:97)
	org.eclipse.lsp4j.jsonrpc.json.ConcurrentMessageProcessor.run(ConcurrentMessageProcessor.java:114)
	java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:842)
```
#### Short summary: 

QDox parse error in file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/servlet/ContentServlet.java