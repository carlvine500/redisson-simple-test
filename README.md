test result: (exception time:10:46:41 ,it still blocked at:10:47:15.70)
```
E:\Workspaces\myeclipse10\redisson-simple-test>mvn test -Dtest=Tester
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for com.gome.arch:redisson-simple-test:jar:0.0.1-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 24, column 12
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building redisson-simple-test 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ redisson-simple-test ---
[WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ redisson-simple-test ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ redisson-simple-test ---
[WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ redisson-simple-test ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ redisson-simple-test ---
[INFO] Surefire report directory: E:\Workspaces\myeclipse10\redisson-simple-test\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running cc.Tester
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
false
false
七月 28, 2016 10:46:41 上午 io.netty.util.concurrent.DefaultPromise notifyListener0
警告: An exception was thrown by org.redisson.command.CommandAsyncService$9.operationComplete()
org.redisson.client.RedisNodeNotFoundException: No node for slot: /10.126.53.248:8308
        at org.redisson.connection.MasterSlaveConnectionManager.getEntry(MasterSlaveConnectionManager.java:598)
        at org.redisson.connection.MasterSlaveConnectionManager.connectionWriteOp(MasterSlaveConnectionManager.java:588)
        at org.redisson.command.CommandAsyncService.async(CommandAsyncService.java:425)
        at org.redisson.command.CommandAsyncService.checkAttemptFuture(CommandAsyncService.java:688)
        at org.redisson.command.CommandAsyncService.access$300(CommandAsyncService.java:68)
        at org.redisson.command.CommandAsyncService$9.operationComplete(CommandAsyncService.java:493)
        at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:522)
        at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:515)
        at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:494)
        at io.netty.util.concurrent.DefaultPromise.notifyListenersWithStackOverFlowProtection(DefaultPromise.java:435)
        at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:424)
        at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:129)
        at org.redisson.client.protocol.CommandData.tryFailure(CommandData.java:72)
        at org.redisson.client.handler.CommandDecoder.decode(CommandDecoder.java:234)
        at org.redisson.client.handler.CommandDecoder.decode(CommandDecoder.java:117)
        at io.netty.handler.codec.ReplayingDecoder.callDecode(ReplayingDecoder.java:367)
        at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:248)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:334)
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:327)
        at io.netty.channel.ChannelInboundHandlerAdapter.channelRead(ChannelInboundHandlerAdapter.java:86)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:334)
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:327)
        at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1279)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:334)
        at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:889)
        at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:131)
        at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:572)
        at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:513)
        at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:427)
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:399)
        at io.netty.util.concurrent.SingleThreadEventExecutor$2.run(SingleThreadEventExecutor.java:136)
        at io.netty.util.concurrent.DefaultThreadFactory$DefaultRunnableDecorator.run(DefaultThreadFactory.java:145)
        at java.lang.Thread.run(Thread.java:745)

终止批处理操作吗(Y/N)? y

E:\Workspaces\myeclipse10\redisson-simple-test>time
当前时间: 10:47:15.70
输入新时间:

```