## Setup your local enviornment
```bash
brew install pyenv poetry
pyenv install 3.7.17
pyenv local 3.7.17
eval "$(pyenv init -)"
poetry config virtualenvs.in-project true
poetry install
```

