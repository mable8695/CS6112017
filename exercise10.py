 import numpy as np
import matplotlib.pylab as py
x = np.linspace(0,2)
y1 = np.sin(x-2)**2
y2 = np.exp(-(x**2))
y = y1*y2
py.plot(x,y,'k--')
py.xlabel('interval:')
py.ylabel('Function - f(x)')
py.title('plotting function \'matplotlib\'')
py.show()
