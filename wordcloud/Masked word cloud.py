from os import path
from PIL import Image
import numpy as np
import matplotlib.pyplot as plt
from wordcloud import WordCloud

filen = path.dirname(__file__)
char = open(path.join(filen, 'nin.txt')).read()

goku_mask = np.array(Image.open(path.join(filen, "goku.jpg")))
wc = WordCloud(background_color="white", max_words=2000, mask=goku_mask)

wc.generate(char)

plt.imshow(wc)
plt.axis("off")
plt.figure()
plt.imshow(goku_mask, cmap=plt.cm.gray)
plt.axis("off")
plt.show()
