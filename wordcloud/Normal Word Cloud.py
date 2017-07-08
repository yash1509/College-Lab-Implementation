from os import path
from wordcloud import WordCloud
import matplotlib.pyplot as plt
d = path.dirname(__file__)
text = open(path.join(d, 'shakes.txt')).read()
wordcloud = WordCloud(background_color='white',
                          width=1280,
                          height=720).generate(text)

plt.figure()
plt.imshow(wordcloud)
plt.axis("off")
plt.show()

