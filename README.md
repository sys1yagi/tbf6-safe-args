# tbf6-safe-args


本リポジトリは[技術書典6](https://techbookfest.org/event/tbf06)に参加した[TechBooster](https://techbooster.org/android/18129/)による、
[TODO]()の第n章「Safe Argsを使ってActivityやFragmentの引数を型安全にしよう」に関するサンプルコードです。


# Safe Argsだけを使う

Safe Argsだけを使う例はmasterブランチで実装しています。


[build.gradle](https://github.com/sys1yagi/tbf6-safe-args/blob/master/build.gradle)と
[app/build.gradle](https://github.com/sys1yagi/tbf6-safe-args/blob/master/app/build.gradle)の設定、[navigation.xmlの定義](https://github.com/sys1yagi/tbf6-safe-args/blob/master/app/src/main/res/navigation/navigation.xml)、[TopFragment.ktの実装](https://github.com/sys1yagi/tbf6-safe-args/blob/master/app/src/main/java/com/sys1yagi/safe_args_sample/ui/top/TopFragment.kt)を参照すると概ね理解ができると思います。


# NavigationとともにSafe Argsを使う

NavigationとともにSafe Argsを使うケースは[with_navigationブランチ](https://github.com/sys1yagi/tbf6-safe-args/tree/with_navigation)で実装しています。Safe Argsそのものの使い方に変化はありません。
