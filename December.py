import sys
import time

def jalanin_lirik():
    lirik = [
    ("Pain is never permanent but tonight it's killing me", 0.1),
    ("I hope you get your ballroom floor", 0.09),
    ("Your perfect house with rose red doors", 0.07),
    ("I'm the last thing you'd remember", 0.05),
    ("It's been a long, lonely December", 0.08),
    ("I wish I'd known that less is more", 0.07),
    ("But I was passed out on the floor", 0.09),
    ("And that's the last thing I remember", 0.06),
    ("It's been a long, lonely December", 0.09),
    ]

    delay = [0.9, 0.6, 0.5, 0.6, 0.8, 0.85, 0.9, 0.6, 0.9]
    print("\n==December - NeckDeep==")
    time.sleep(2)
    for i, (baris_lagu, delay_karakter) in enumerate(lirik):
        for karakter in baris_lagu :
            print(karakter, end='', flush=True)
            sys.stdout.flush()
            time.sleep(delay_karakter)
        time.sleep(delay[i])
        print('')

         

jalanin_lirik()