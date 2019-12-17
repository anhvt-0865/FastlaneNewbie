#echo "This is config initialzation"
#echo "Enter your base url: "
#read baseurl
#echo "Base url is $baseurl ? (y/n)"
#read confirm
#if [ $confirm == "y" ]
#then
#echo "$baseurl" > ../../config/config.properties
#else
#echo "Error"
#fi
#
#value=$(<../../config/config-dev.properties)
#echo "$value"

PROPERTY_FILE=../../config/config-dev.properties

function getProperty {
PROP_KEY=$1
echo PROP_KEY
PROP_VALUE=`cat $PROPERTY_FILE | grep "$PROP_KEY" | cut -d'=' -f2`
echo $PROP_VALUE
}

echo "# Reading property from $PROPERTY_FILE"
REPOSITORY_URL=$(getProperty "url")
