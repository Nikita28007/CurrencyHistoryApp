package com.currency.app

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentDetails : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.details_fragment, container, false)
        val pos = arguments?.getInt("pos")
        val images = images()
        val data = addDataDesc()
        view.findViewById<ImageView>(R.id.imageDetailFragment).setImageResource(images[pos!!])
        view.findViewById<TextView>(R.id.detailsFragmentText).text = data[pos]
        return view
    }

    private fun images(): ArrayList<Int> {
        val arr = ArrayList<Int>()
        arr.add(R.drawable.dollar)
        arr.add(R.drawable.euro)
        arr.add(R.drawable.ruble)
        arr.add(R.drawable.pounds)
        arr.add(R.drawable.tenge)
        arr.add(R.drawable.zloty)
        arr.add(R.drawable.bitcoin)
        return arr
    }

    private fun addDataDesc(): ArrayList<String> {
        val arrDesc = ArrayList<String>()
        arrDesc.add(
            "Colonial Period:\n" + "The history of the United States dollar can be traced back to the colonial period when various forms of foreign currencies and barter systems were used. The Spanish dollar, or \"piece of eight,\" was widely accepted in the American colonies.\n" +
                    "\n" +
                    "Continental Congress:\n" + " During the American Revolutionary War, the Continental Congress issued the Continental Currency to finance the war effort. However, this currency quickly depreciated due to lack of backing and rampant counterfeiting.\n" +
                    "\n" +
                    "The First Dollar:\n" + "The United States adopted the U.S. dollar as its official currency in 1792 with the passage of the Coinage Act. The U.S. Mint was established to produce standardized gold, silver, and copper coins. The dollar was backed by a bimetallic standard, with both gold and silver coins in circulation.\n" +
                    "\n" +
                    "Civil War and Greenbacks:\n" + "The American Civil War led to the issuance of \"greenbacks,\" which were unbacked paper money. After the war, the U.S. returned to the gold standard, but greenbacks remained in circulation.\n" +
                    "\n" +
                    "Gold Standard:\n" + "The U.S. officially adopted the gold standard in 1900, meaning that the value of the U.S. dollar was tied to a specific quantity of gold. This standard persisted for several decades.\n" +
                    "\n" +
                    "Great Depression and Abandonment of Gold Standard:\n" + "The Great Depression in the 1930s led to a series of economic challenges. In 1933, President Franklin D. Roosevelt took the U.S. off the gold standard, making it illegal for U.S. citizens to own gold coins or bullion.\n" +
                    "\n" +
                    "Bretton Woods Agreement:\n" + "After World War II, the Bretton Woods Agreement in 1944 established the U.S. dollar as the world's primary reserve currency, with its value linked to gold. Other currencies were pegged to the U.S. dollar.\n" +
                    "\n" +
                    "Nixon Shocks and Floating Exchange Rates:\n" + "In 1971, President Richard Nixon ended the gold standard completely, causing the U.S. dollar to become a fiat currency. This marked the transition to a system of floating exchange rates, where the dollar's value is determined by supply and demand in international currency markets.\n" +
                    "\n" +
                    "Modern Era:\n" + "Since the abandonment of the gold standard, the U.S. dollar has maintained its status as a global reserve currency. It is widely used in international trade and finance. The Federal Reserve, the central bank of the United States, manages monetary policy to stabilize the currency's value.\n" +
                    "\n" +
                    "Challenges and Developments:\n" + "The U.S. dollar has faced challenges, including inflation, economic crises, and debates over its role in the global economy. It remains a symbol of the U.S. economy and is commonly used in international transactions."
        )
        arrDesc.add(
            "Origins:\n" + "The idea of a single European currency dates back to the aftermath of World War II when European leaders began to envision closer economic integration as a means to prevent future conflicts. The concept gained momentum in the late 20th century.\n" +
                    "\n" +
                    "Maastricht Treaty:\n" + "The formal groundwork for the euro was laid with the Maastricht Treaty, officially known as the Treaty on European Union, signed in 1992. This treaty outlined the criteria for participating countries and the steps toward the Economic and Monetary Union (EMU).\n" +
                    "\n" +
                    "Introduction of the Euro:\n" + "The euro was introduced as an accounting currency on January 1, 1999, with electronic transactions and financial markets adopting it. However, euro banknotes and coins didn't enter circulation until January 1, 2002.\n" +
                    "\n" +
                    "Participating Countries:\n" + "Initially, 12 European Union (EU) member states adopted the euro in 1999, including Germany, France, Italy, and Spain. Over the years, the eurozone has expanded, and as of my last knowledge update in 2022, 19 of the 27 EU member states have adopted the euro.\n" +
                    "\n" +
                    "The Euro as a Reserve Currency:\n" + "The euro quickly became one of the world's major reserve currencies and a competitor to the U.S. dollar. It is also used as the second most-traded currency in the world after the U.S. dollar.\n" +
                    "\n" +
                    "European Central Bank:\n" + "The European Central Bank (ECB) was established to manage the euro and oversee monetary policy for the eurozone. The ECB is responsible for maintaining price stability and controlling inflation within the eurozone.\n" +
                    "\n" +
                    "Economic Challenges:\n" + "The euro has faced various challenges, including the European debt crisis that began in the late 2000s. This crisis affected several member countries, leading to economic reforms and discussions about the sustainability of the currency union.\n" +
                    "\n" +
                    "The Euro's Role in the European Union:\n" + "The euro is a symbol of the European Union's economic integration and the single market. It is used for trade and financial transactions among member states, promoting economic efficiency and reducing currency exchange costs.\n" +
                    "\n" +
                    "Future Developments:\n" + "The euro's future depends on the economic and political stability of the eurozone and the European Union. Discussions about further integration and potential expansions continue among member states."
        )

        arrDesc.add(
            "Early Origins: \n" + "The ruble's history dates back to the late 13th century when it was first introduced as a silver coin during the reign of Ivan the Terrible. The name \"ruble\" is believed to be derived from the Russian word \"рубить\" (rubit), which means \"to chop\" or \"to cut,\" referring to the way silver bars were cut into pieces to create coins.\n" +
                    "\n" +
                    "Imperial Russia:\n" + "The ruble became the official currency of the Russian Empire in the 17th century and was issued in various denominations, including silver and copper coins. The ruble remained the currency throughout the imperial era, even through the reign of the last Tsar, Nicholas II.\n" +
                    "\n" +
                    "Russian Revolution:\n" + "The Russian Revolution of 1917 brought about significant political and economic changes. During this time, various forms of currency, including banknotes issued by different factions, were in circulation.\n" +
                    "\n" +
                    "Soviet Era: \n" + "The Soviet government established the Soviet ruble in 1922, which replaced the previous currency system. The ruble underwent various reforms and redenominations during this period to combat hyperinflation.\n" +
                    "\n" +
                    "Post-Soviet Era:\n" + "With the dissolution of the Soviet Union in 1991, the Russian Federation inherited the Soviet ruble. In 1992, a new currency, the Russian ruble (RUB), was introduced to replace the Soviet ruble. It faced significant economic challenges and hyperinflation during the 1990s.\n" +
                    "\n" +
                    "Stabilization and Modernization:\n" + "Over the years, Russia has made efforts to stabilize its currency and modernize its financial system. The ruble has become a free-floating currency, its value subject to market forces, and it is now traded on international currency markets.\n" +
                    "\n" +
                    "Challenges and Fluctuations:\n" + "The ruble has faced numerous challenges, including economic crises, fluctuations in global oil prices, and international sanctions. These factors have influenced the ruble's exchange rate.\n" +
                    "\n" +
                    "Recent Developments:\n" + "In recent years, Russia has sought to reduce its dependence on the U.S. dollar and has been increasing its gold reserves as part of its effort to strengthen the ruble's stability and promote its use in international trade."
        )

        arrDesc.add(
            "Origins:\n" + "The pound sterling has its origins in the Roman period when the \"libra\" was used as a unit of weight. Over time, it evolved into a unit of currency in various forms.\n" +
                    "\n" +
                    "Pound Tower Weight:\n" + "In the late 15th century, the \"pound tower weight\" was introduced, and the pound was associated with the Troy pound, which was used for precious metals. The Tower pound was used for coinage.\n" +
                    "\n" +
                    "Decimalization:\n" + "Before decimalization, the pound was divided into 20 shillings, each consisting of 12 pence. In 1971, the UK adopted decimal currency, with one pound being subdivided into 100 new pence (p).\n" +
                    "\n" +
                    "Gold Standard:\n" + "The United Kingdom was one of the earliest countries to adopt the gold standard in the 19th century, which pegged the pound's value to a specific quantity of gold. This system was abandoned during World War I.\n" +
                    "\n" +
                    "Bretton Woods and Post-World War II:\n" + "After World War II, the pound was part of the Bretton Woods system, where it was pegged to the U.S. dollar. However, due to economic challenges, the UK was forced to devalue the pound in 1967.\n" +
                    "\n" +
                    "1970s Crisis:\n" + "The UK faced a significant economic crisis in the 1970s, leading to a series of currency devaluations. The pound struggled against inflation and lost value on international markets.\n" +
                    "\n" +
                    "Floating Exchange Rate:\n" + "In 1979, the pound transitioned to a floating exchange rate system, where its value is determined by supply and demand in the foreign exchange market.\n" +
                    "\n" +
                    "Modern Era:\n" + "The British pound remains one of the world's major reserve currencies and is widely traded in international financial markets. It plays a pivotal role in international finance, and the Bank of England manages monetary policy to stabilize the currency.\n" +
                    "\n" +
                    "Challenges and Developments:\n" + "The pound has faced various economic challenges, including the impact of the 2016 Brexit referendum. The decision to leave the European Union led to fluctuations in the pound's value and raised questions about its future role in global finance."
        )
        arrDesc.add(
            "Introduction: The tenge was introduced as the official currency of Kazakhstan on November 15, 1993, shortly after Kazakhstan gained independence from the Soviet Union. The word \"tenge\" means \"scale\" or \"balance\" in Kazakh and was historically used to refer to a set of scales used in trade.\n" +
                    "\n" +
                    "Post-Soviet Transition: In the early 1990s, as Kazakhstan transitioned from a centrally planned economy to a market-oriented one, the need for a national currency became apparent. The tenge replaced the Soviet ruble as the official currency.\n" +
                    "\n" +
                    "Transition from Russian Ruble: Initially, after gaining independence, the Russian ruble was used as a de facto currency in Kazakhstan. The transition to the tenge was a significant step in establishing economic independence.\n" +
                    "\n" +
                    "Banknotes and Coins: The tenge is available in both banknotes and coins. Banknotes come in various denominations, with designs that showcase Kazakh culture and historical figures. Coins are issued in different values, from small change to higher denominations.\n" +
                    "\n" +
                    "Exchange Rate Policy: The tenge's exchange rate has experienced fluctuations since its introduction. The Kazakhstani government has adopted various exchange rate policies, including fixed and managed float systems, in an effort to maintain stability in the currency.\n" +
                    "\n" +
                    "Global Economic Challenges: The tenge, like many other currencies, faced challenges during global economic crises and fluctuations in oil prices, as Kazakhstan is a major oil-producing country. These factors influenced the currency's exchange rate.\n" +
                    "\n" +
                    "Economic Development: Kazakhstan has sought to diversify its economy and reduce its dependence on oil exports. As the country has developed economically, the tenge has played a central role in facilitating trade and investment.\n" +
                    "\n" +
                    "Economic Integration: Kazakhstan is a member of several regional organizations, including the Eurasian Economic Union (EEU). This has led to some coordination of economic policies, including currency exchange, with other member countries."
        )
        arrDesc.add(
            "Historical Background:\n" + "The term \"zloty\" has a long history in Poland and originally referred to a unit of weight, particularly a golden one. It was used for trading and was often associated with precious metals.\n" +
                    "\n" +
                    "First Modern Zloty:\n" + "The modern zloty was introduced in 1924 after Poland regained its independence following World War I. It replaced the Polish mark. The zloty was initially on the gold standard, with the value tied to a specific amount of gold.\n" +
                    "\n" +
                    "World War II and Communism:\n" + "During World War II and the subsequent communist era, the zloty went through various devaluations and reforms. The currency was not freely convertible, and its value was often subject to government control.\n" +
                    "\n" +
                    "Post-Communist Reforms:\n" + "With the collapse of communism in the late 1980s and early 1990s, Poland underwent significant economic reforms. In 1995, Poland redenominated the zloty, cutting four zeroes from the currency to control hyperinflation.\n" +
                    "\n" +
                    "EU Accession and the Euro:\n" + "Poland joined the European Union (EU) in 2004, but it has not yet adopted the euro. The country has retained its national currency, the zloty, and has not set a specific timeline for euro adoption.\n" +
                    "\n" +
                    "Modern Zloty:\n" + "The modern Polish zloty is a fully convertible currency, with banknotes and coins in circulation. The National Bank of Poland is responsible for managing the currency and implementing monetary policy.\n" +
                    "\n" +
                    "Stability and Economic Growth:\n" + "Poland has experienced significant economic growth and stability since the 1990s. The zloty has played a key role in facilitating this economic development, and it is used for trade, investments, and daily transactions.\n" +
                    "\n" +
                    "Design and Denominations:\n" + "Zloty banknotes and coins feature various designs that reflect Poland's culture, history, and notable figures. Banknotes come in various denominations, and coins are issued in different values, making the zloty a practical currency for everyday use."
        )
        arrDesc.add(
            "Genesis:\n" + "Bitcoin was created in 2008 by an individual or group using the pseudonym \"Satoshi Nakamoto.\" The concept was outlined in a whitepaper titled \"Bitcoin: A Peer-to-Peer Electronic Cash System\" released in October 2008.\n" +
                    "\n" +
                    "The First Block:\n" + "The Bitcoin network officially came into existence on January 3, 2009, when Nakamoto mined the first block, known as the \"genesis block.\" This day is now celebrated as \"Bitcoin's birthday.\"\n" +
                    "\n" +
                    "Early Development:\n" + "In the early days, Bitcoin was relatively unknown and was primarily used by cypherpunks and tech enthusiasts. It gained attention as a decentralized digital currency with the promise of peer-to-peer transactions without the need for intermediaries like banks.\n" +
                    "\n" +
                    "Mining and Halving:\n" + "Bitcoin operates on a blockchain, a decentralized ledger. Miners use computational power to solve complex mathematical problems and validate transactions. Mining rewards are halved approximately every four years, a process known as \"halving,\" to control the creation of new bitcoins and mimic the scarcity of finite resources like gold.\n" +
                    "\n" +
                    "Growth and Acceptance:\n" + "Over the years, Bitcoin's user base and acceptance grew. It started to be used for various purposes, including online purchases, investments, and even as a store of value.\n" +
                    "\n" +
                    "Volatility and Price Surges:\n" + "Bitcoin's price has experienced extreme volatility, with significant price surges and crashes. Notable price increases have attracted investors, speculators, and media attention, leading to a series of \"boom and bust\" cycles.\n" +
                    "\n" +
                    "Ecosystem Expansion:\n" + "Bitcoin's success led to the development of a broader cryptocurrency ecosystem, with thousands of other cryptocurrencies, known as \"altcoins,\" emerging. It also spawned the creation of cryptocurrency exchanges, wallets, and other supporting infrastructure.\n" +
                    "\n" +
                    "Regulatory Challenges:\n" + "Bitcoin has faced regulatory scrutiny and varying degrees of acceptance around the world. Governments and financial institutions have raised concerns about its potential use in illegal activities, leading to regulations and bans in some countries.\n" +
                    "\n" +
                    "Institutional Adoption:\n" + "In recent years, institutional investors, including hedge funds and publicly traded companies, have shown interest in Bitcoin. They see it as a potential store of value and an alternative asset class.\n" +
                    "\n" +
                    "Future Prospects:\n" + "The future of Bitcoin remains a subject of debate. Some see it as a digital gold and a hedge against inflation, while others remain skeptical of its long-term prospects and potential regulatory hurdles."
        )

        return arrDesc
    }


}