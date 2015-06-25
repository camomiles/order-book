# order-book
Order Book implementation in pure Java (nothing fancy)

[What's an Order Book?](https://en.wikipedia.org/wiki/Order_book_(trading))

Installation:

```
git clone https://github.com/camomiles/order-book

```

Usage: 

```
1. Compile

   javac orderBook.java

2. Run (use -Xmx6g to increase Java Heap size for big files)
	
   java orderBook

   or 

   java -Xmx6g orderBook

```


Sample structure for xml input file:

```
<?xml version="1.0" encoding="UTF-8"?>
<Orders>
<AddOrder book="book-1" operation="SELL" price="100.50" volume="81" orderId="1" />
<AddOrder book="book-3" operation="BUY" price=" 99.50" volume="86" orderId="2" />
<AddOrder book="book-1" operation="BUY" price=" 99.70" volume="16" orderId="3" />
<AddOrder book="book-3" operation="SELL" price="100.00" volume="80" orderId="4" />
<AddOrder book="book-2" operation="SELL" price="100.50" volume="79" orderId="5" />
<AddOrder book="book-2" operation="BUY" price=" 99.40" volume="78" orderId="6" />
<AddOrder book="book-3" operation="SELL" price="100.00" volume="82" orderId="7" />
<AddOrder book="book-2" operation="SELL" price="100.20" volume="42" orderId="8" />
<AddOrder book="book-3" operation="SELL" price="100.40" volume="75" orderId="9" />
<AddOrder book="book-1" operation="BUY" price=" 99.80" volume="64" orderId="10" />
<AddOrder book="book-2" operation="SELL" price="100.50" volume="46" orderId="11" />
<AddOrder book="book-3" operation="SELL" price="100.00" volume="48" orderId="12" />
<AddOrder book="book-2" operation="SELL" price="100.20" volume="99" orderId="13" />
<AddOrder book="book-3" operation="SELL" price="100.40" volume="23" orderId="14" />
<AddOrder book="book-3" operation="BUY" price="100.00" volume="55" orderId="15" />
<AddOrder book="book-2" operation="SELL" price="100.10" volume="29" orderId="16" />
<AddOrder book="book-3" operation="SELL" price="100.00" volume="24" orderId="17" />
<AddOrder book="book-1" operation="SELL" price="100.20" volume="24" orderId="18" />
<AddOrder book="book-3" operation="BUY" price="100.30" volume="18" orderId="19" />
<AddOrder book="book-2" operation="BUY" price=" 99.60" volume="84" orderId="20" />

........

<AddOrder book="book-2" operation="BUY" price=" 99.90" volume="98" orderId="1760839" />
<AddOrder book="book-1" operation="BUY" price=" 99.70" volume="87" orderId="1760840" />
<DeleteOrder book="book-2" orderId="1760649" />
<AddOrder book="book-3" operation="SELL" price="100.50" volume="75" orderId="1760841" />
<AddOrder book="book-2" operation="BUY" price=" 99.60" volume="6" orderId="1760842" />
<AddOrder book="book-3" operation="SELL" price=" 99.10" volume="51" orderId="1760843" />
<AddOrder book="book-1" operation="BUY" price=" 99.80" volume="63" orderId="1760844" />
<AddOrder book="book-1" operation="BUY" price=" 99.20" volume="12" orderId="1760845" />
<DeleteOrder book="book-2" orderId="1760839" />
<DeleteOrder book="book-1" orderId="1760740" />
<AddOrder book="book-3" operation="SELL" price="100.20" volume="46" orderId="1760846" />
<AddOrder book="book-2" operation="BUY" price=" 99.70" volume="58" orderId="1760847" />
<AddOrder book="book-3" operation="BUY" price=" 99.90" volume="98" orderId="1760848" />
<AddOrder book="book-3" operation="BUY" price=" 99.70" volume="8" orderId="1760849" />
<DeleteOrder book="book-3" orderId="1760497" />
<DeleteOrder book="book-2" orderId="1760689" />
<AddOrder book="book-2" operation="BUY" price="100.00" volume="30" orderId="1760850" />
<AddOrder book="book-3" operation="SELL" price=" 99.80" volume="48" orderId="1760851" />
<DeleteOrder book="book-2" orderId="1760803" />
<AddOrder book="book-2" operation="BUY" price=" 99.40" volume="32" orderId="1760852" />
<AddOrder book="book-3" operation="SELL" price="100.40" volume="57" orderId="1760853" />
<AddOrder book="book-3" operation="BUY" price=" 99.30" volume="27" orderId="1760854" />
<AddOrder book="book-3" operation="BUY" price=" 99.60" volume="43" orderId="1760855" />
<DeleteOrder book="book-2" orderId="1760684" />
</Orders>

```