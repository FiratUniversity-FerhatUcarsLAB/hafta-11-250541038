1. Stack Diyagramı (İlk ping çağrıldığında):

main: Aktif.

zoop: Aktif. main tarafından çağrıldı.

baffle: Aktif. zoop tarafından çağrıldı.

ping: Aktif. baffle tarafından çağrıldı.

2. Programın Tam Çıktısı: Kod System.out.print (yan yana) ve println (alt satıra geç) karışık kullanıyor. Dikkat edelim.

main -> "No, I " (print)

zoop -> baffle -> "wug" (print) -> ping -> "." (println)

Şu anki çıktı: No, I wug. (alt satıra indi)

zoop devam ediyor -> "You wugga " (print)

zoop -> baffle -> "wug" (print) -> ping -> "." (println)

Şu anki çıktı: You wugga wug. (alt satıra indi)

main devam ediyor -> "I " (print)

main -> baffle -> "wug" (print) -> ping -> "." (println)

Şu anki çıktı: I wug. (alt satıra indi)

Nihai Çıktı:
No, I wug.
You wugga wug.
I wug.
