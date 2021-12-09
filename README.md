# tic_tac_toe

# Decision Tree Regression

# Importing the libraries
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

# Importing the dataset
dataset = pd.read_csv('Position_Salaries.csv')
X = dataset.iloc[:, 1:2].values
y = dataset.iloc[:, 2].values

# Fitting Decision Tree Regression to the dataset
from sklearn.tree import DecisionTreeRegressor
regressor = DecisionTreeRegressor(random_state = 0)
regressor.fit(X, y)

# Predicting a new result
y_pred=regressor.predict([[6.5]])

# Visualising the Decision Tree Regression results (higher resolution)
X_grid = np.arange(min(X), max(X), 0.01)
X_grid = X_grid.reshape((len(X_grid), 1))
plt.scatter(X, y, color = 'red')
plt.plot(X_grid, regressor.predict(X_grid), color = 'blue')
plt.title('Truth or Bluff (Decision Tree Regression)')
plt.xlabel('Position level')
plt.ylabel('Salary')
plt.show()


https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbFR2eEozZkFTSGZFLVlLSVVhTy1VcUlTTUk3d3xBQ3Jtc0tuNE9yc3RfLUc2bzV0Zm9YaGUxNHY5dld5NnZpQUtsVjdkR3BHZ0JDSUJSdldDX2FzVzVUTndFTkJwSFJUYzBIRklDRVRyckYwYzhFTmhZc1ZkU1dLeUc5UXZDWWpFRlN4bnhLWnJ3RG9LczREWURJdw&q=https%3A%2F%2Fdrive.google.com%2Ffile%2Fd%2F1IHqjlnzlZJHCwY2q9SD7XoY3VhdTGLWU%2Fview%3Fusp%3Dsharing



https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbWlKaTRoblVPZTVYMDdNQ1lNN0NPMkxDMXVjQXxBQ3Jtc0tuQ0pZemhoclJvQVh1TktkWmVJMTFabTZJTVlPT3cwMnI4TGtZZ1VHcVNpUV9MSy1SVkxMdTc2N0ZCZVZjd2hXbzFEMldRWGVGdWFVckFiSHh5UmRLVmtCYWVqMXR0N19QY19wT3lVRUZUWEZRa2pNRQ&q=https%3A%2F%2Fgithub.com%2FSuji04%2FML_from_Scratch%2Fblob%2Fmaster%2Fdecision%2520tree%2520regression.ipynb




https://github.com/Suji04/ML_from_Scr...

